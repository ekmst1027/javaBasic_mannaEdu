package ch20_network;

import java.net.ServerSocket;

// Socket(소켓)
// 서버소켓 : 서비스 제공을 위한 소켓(ip, port)
// 소켓  : 서비스 사용일 위한 소켓
public class SocketExam {
	public static void main(String[] args) {
		 ServerSocket socket = null;	// 서버소켓 객체
//		Socket socket = null;	// 클라이언트 소켓
		// 포트번호 : 0~65535 내에서 배정이 가능하고 중복되지 않아야 함
		// well known port number(자주 사용하는 포트 번호)
		// 80 : 웹 서비스, 21 : FTP 서비스, 445 : 파일공유, 3389: 원격접속
		for(int i = 0; i <= 65535; i++) {
			try {
				// socket = new ServerSocket(i);	// i번 포트를 사용하는 소켓을 생성
				socket = new ServerSocket(i);
				socket.close();	// 소켓 해제
			} catch(Exception e) {
				System.out.println(i + "번 포트는 사용중입니다.");
			}
		}
	}
}
