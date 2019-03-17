package ch21_jdbc;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class LogintTest extends JFrame {

	private JPanel contentPane;
	private JPasswordField pwd;
	private JTextField userId;
	private JLabel lblResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogintTest frame = new LogintTest();
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
	public LogintTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setBounds(18, 18, 61, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("비밀번호");
		lblNewLabel_1.setBounds(18, 58, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		userId = new JTextField();
		userId.setBounds(98, 13, 130, 26);
		contentPane.add(userId);
		userId.setColumns(10);
		
		pwd = new JPasswordField();
		pwd.setBounds(108, 53, 120, 26);
		contentPane.add(pwd);
		
		JButton btnLogin = new JButton("로그인");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String strUserid = userId.getText();
				// 패스워드필드.getPassword() => 문자배열
				// String.valueOf(문자배열) => 문자배열을 스트링으로 변환
				String strPwd = String.valueOf(pwd.getPassword());
				System.out.println("아이디 : " + strUserid);
				System.out.println("비밀번호 : " + strPwd);
				
				Connection conn = null;	// db접속 객체
				PreparedStatement pstmt = null;	// sql 실행 객체
				ResultSet rs = null;	// sql 실행 결과셋을 탐색하는 객체
				try {
					FileInputStream fis = new FileInputStream("/Users/kyeongmin/Documents/Java_study/db.prop");
					Properties prop = new Properties();
					prop.load(fis);	// 파일 내용을 로딩하여 prop에 저장
					String url = prop.getProperty("url");
					String id = prop.getProperty("id");
					String password = prop.getProperty("password");
					// db에 접속
					conn = DriverManager.getConnection(url, id, password);
					String sql = "SELECT * FROM member where userid=? and pwd=?";	// sql 명령어 작성
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, strUserid);	// 1번 물음표에 아이디 입력
					pstmt.setString(2, strPwd); 	// 2번 물음표에 비밀번호 입력
					rs = pstmt.executeQuery();	// sql 실행, 결과셋을 rs에 전달
					// 결과셋에 자료가 있으면(로그인 성공)
					if(rs.next()) {
						lblResult.setText(rs.getString("name") + "님 환영합니다.");
					// 괄과셋에 자료가 없으면(로그인 실패)
					} else {
						lblResult.setText("아이디 또는 비밀번호가 일치하지 않습니다.");
					}
					
				} catch (Exception e2) {
					e2.printStackTrace();
				} finally {
					try {
						if(rs != null) rs.close();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
					try {
						if(pstmt != null) pstmt.close();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
					try {
						if(conn != null) conn.close();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}
				}
				
			}
		});
		btnLogin.setBounds(68, 109, 117, 29);
		contentPane.add(btnLogin);
		
		lblResult = new JLabel("New label");
		lblResult.setBounds(28, 150, 267, 26);
		contentPane.add(lblResult);
	}
}
