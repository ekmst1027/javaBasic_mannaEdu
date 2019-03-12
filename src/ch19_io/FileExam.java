package ch19_io;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class FileExam extends JFrame {

	private JPanel contentPane;
	private JTextArea ta;
	private JTextField txtFileName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FileExam frame = new FileExam();
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
	public FileExam() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("파일이름");
		lblNewLabel.setBounds(31, 19, 61, 16);
		contentPane.add(lblNewLabel);
		
		txtFileName = new JTextField();
		txtFileName.setBounds(104, 14, 214, 26);
		contentPane.add(txtFileName);
		txtFileName.setColumns(10);
		
		JButton btn = new JButton("확인");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// java.io.File : 파일의 정보(파일이름, 생성일자, 크기)를 제공하는 클래스
				// new File(파일이름) : 파일의 정보를 참조하는 객체 생성
				File file = new File(txtFileName.getText());
				// 파일이 없으면 새로운 파일 생성
				if(!file.exists()) {
					try {
						file.createNewFile();
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}
				String str = "파일이름 : " + file.getName()
								+ "\n파일크기 : " + file.length()
								+ "\n상위폴더 : " + file.getParent();
				ta.setText(str);	// TextArea에 문자열 출력
			}
		});
		btn.setBounds(327, 14, 117, 29);
		contentPane.add(btn);
		
		ta = new JTextArea();
		ta.setBounds(31, 55, 379, 196);
		contentPane.add(ta);
	}
}
