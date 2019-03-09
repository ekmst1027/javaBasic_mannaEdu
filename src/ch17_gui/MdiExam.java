package ch17_gui;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.border.EmptyBorder;

// SDI(Single Document Interface) - 폼 안에 자식 폼을 배치할 수 없음
// MDI(Multiple Document Interface) - 폼 안에 자식폼 배치 가능
// JInternalFrame
public class MdiExam extends JFrame implements Runnable {

	private JPanel contentPane;
	private JProgressBar progress;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MdiExam frame = new MdiExam();
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
	public MdiExam() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JInternalFrame internalFrame = new JInternalFrame("New JInternalFrame");
		internalFrame.setClosable(true);
		internalFrame.setBounds(60, 52, 324, 188);
		contentPane.add(internalFrame);
		internalFrame.getContentPane().setLayout(null);
		
		progress = new JProgressBar();
		progress.setBounds(6, 17, 146, 20);
		internalFrame.getContentPane().add(progress);
		
		JButton btnStart = new JButton("시작");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 프로그레스 값 변경을 위한 백그라운드 스레드 생성
				Thread th = new Thread(MdiExam.this);
				// 백그라운드 스레드 실행 요청
				th.start();	// run()이 실행됨
				
			}
		});
		btnStart.setBounds(177, 8, 117, 29);
		internalFrame.getContentPane().add(btnStart);
		internalFrame.setVisible(true);
	}

	@Override
	public void run() {
		for(int i = 1; i <= 100; i++) {
			progress.setValue(i);	// 프로그레스바의 값이 변경됨
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		JOptionPane.showMessageDialog(this, "완료되었습니다.");
	}
}
