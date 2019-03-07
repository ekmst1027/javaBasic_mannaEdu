package ch17_gui;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.border.EmptyBorder;

// Single Thread - 순차적으로 작업 진행
// Multi Thread - 동시에 작업 진행
// 프로그레스의 값 변경, 화면 처리
public class ProgressExam extends JFrame {

	private JPanel contentPane;
	private JProgressBar progress;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProgressExam frame = new ProgressExam();
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
	public ProgressExam() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		progress = new JProgressBar();
		progress.setStringPainted(true);
		contentPane.add(progress);
		
		JButton btnStart = new JButton("시작");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 백그라운드 스레드 생성(내부클래스로 스레드 구현)
				Thread th = new Thread(new Runnable() {
					@Override
					public void run() {
						for(int i = 1; i <= 100; i++) {
							progress.setValue(i);
							try {
								Thread.sleep(100);
							} catch (InterruptedException e) {
								e.printStackTrace();
							}
						}
						JOptionPane.showMessageDialog(ProgressExam.this, "완료되었습니다.");
					}
				});
				th.start();
				
				// 프로그레스바의 값 변경
//				for(int i = 1; i <= 100; i++) {
//					progress.setValue(i);
//					try {
//						Thread.sleep(100);
//					} catch (InterruptedException e1) {
//						e1.printStackTrace();
//					}
//				}
//				JOptionPane.showMessageDialog(ProgressExam.this, "완료되었습니다.");
			}
		});
		contentPane.add(btnStart);
	}

}
