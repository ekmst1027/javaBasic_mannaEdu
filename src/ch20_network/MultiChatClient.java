package ch20_network;

import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

// GUI멀티채팅(클라이언트용 프로그램)
public class MultiChatClient {
	static String nickName = null;	// 대화명
	static JTextArea ta;
	static JTextField tf;
	static DataOutputStream out;
	
	// 메시지를 보내기 위한 스레드 
	static class ClientSender extends Thread {
		Socket socket;
		String name;
		public ClientSender(Socket socket, String nickName) {
			this.socket = socket;
			try {
				// 데이터를 보내기 위한 출력스트림 생성
				out = new DataOutputStream(socket.getOutputStream());
				this.name = nickName;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		public void run() {
//		Scanner scanner = new Scanner(System.in);
			try {
				if(out != null) {
					out.writeUTF(name);	// 대화명을 보냄
				}
//			while(out != null) {
//				out.writeUTF("[" + name "]" + scanner.nextLine());
//			}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	// 메시지 수신을 위한 스레드
	static class ClientReceiver extends Thread {
		Socket socket;
		DataInputStream in;
		
		public ClientReceiver(Socket socket) {
			this.socket = socket;
			try {
				// 메시지 수신용 스트림 생성
				in = new DataInputStream(socket.getInputStream());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		@Override
		public void run() {
			while(in != null) {
				try {
					String s = in.readUTF();	// 수신한 메시지
					System.out.println(s);
					ta.append(s+"\n");
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	static class ClientScreen extends JFrame implements ActionListener {
		public ClientScreen(String nick) {
			setSize(300, 300);	// 프레임의 사이즈
			setDefaultCloseOperation(EXIT_ON_CLOSE);	// 닫기 버튼 설정
			setTitle(nick + "의 채팅방 클라이언트");	// 타이틀 설정
			
			ta = new JTextArea(25, 40);	// 25행 40열 
			tf = new JTextField(25);	// 25컬럼
			tf.addActionListener(this);	// 텍스트필드에 이벤트 기능 추가
			
			JPanel panel = new JPanel();
			// 패널의 레이아웃을 변경시킴(FloyLayout => BorderLayout)
			panel.setLayout(new BorderLayout());
			// 패널의 배치 방향 설정(좌에서 우로)
			panel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
			JLabel label_name = new JLabel(nick + "님 ");
			// 패널에 레이블과 텍스트필드 배치
			panel.add(label_name, "West");
			panel.add(tf, "Center");
			// 프레임에 JTextArea와 JPanel을 붙임
			add(ta, "Center");
			add(panel, "South");
			setVisible(true); 	// 화면에 표시
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// 텍스트필드에서 엔터키 입력
			if(e.getSource() == tf) {
				try {
					// 텍스트필드에 입력한 문자열을 보냄
					out.writeUTF("[" + nickName + "]" + tf.getText());
					tf.setText("");
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		nickName = JOptionPane.showInputDialog("대화명을 입력하세요");
		new ClientScreen(nickName);	// 클라이언트 화면 구성
		Socket socket;
		try {
			String serverIp = "127.0.0.1";
			// 서버 ip주소, 포트번호로 접속
			socket = new Socket(serverIp, 7777);
			System.out.println("서버에 연결되었습니다.");
			// 메시지 수신용 스레드
			Thread receiveThread = new ClientReceiver(socket);
			receiveThread.start();
			// 메시지 발신용 스레드
			Thread sender = new ClientSender(socket, nickName);
			sender.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
