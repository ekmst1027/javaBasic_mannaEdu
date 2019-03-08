package ch17_gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class LoginExam extends JFrame {

	private JPanel contentPane;
	private JTextField userid;
	private JPasswordField pwd;
	private JLabel lblResult;
	
	private Map<String, String> map;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginExam frame = new LoginExam();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginExam() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		userid = new JTextField();
		userid.setBounds(146, 30, 130, 26);
		contentPane.add(userid);
		userid.setColumns(10);
		
		pwd = new JPasswordField();
		pwd.setBounds(146, 81, 130, 26);
		contentPane.add(pwd);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setBounds(58, 35, 61, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("비밀번호");
		lblNewLabel_1.setBounds(58, 86, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		// 해시맵 생성
		map = new HashMap<>();
		// 맵.put(key, value) : 맵에 값을 입력
		map.put("kim", "1234");
		map.put("park", "2222");
		map.put("hong", "3333");
		
		JButton btnLoginutton = new JButton("로그인");
		btnLoginutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 텍스트필드.getText() : 입력내용 읽기
				String id = userid.getText();
				// JPasswordField의 입력값은 char[]로 리턴됨
				// String.valueOf(문자배열) => 스트링으로 변환
				String pw = String.valueOf(pwd.getPassword());
				// 맵.get(key) => value가 리턴됨
				String strId = map.get(id);
				if(strId != null && strId.equals(pw) ) {
					// 글자색(전경색)
					lblResult.setForeground(Color.blue);
					lblResult.setText(id + "님 환영합니다.");
				} else {
					lblResult.setForeground(Color.red);
					lblResult.setText("아이디 또는 비밀번호가 일치하지 않습니다.");
				}
			}
		});
		btnLoginutton.setBounds(146, 134, 117, 29);
		contentPane.add(btnLoginutton);
		
		lblResult = new JLabel("New label");
		lblResult.setBounds(58, 186, 308, 16);
		contentPane.add(lblResult);
	}
}
