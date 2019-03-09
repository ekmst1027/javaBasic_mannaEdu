package ch17_gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class TabExam extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TabExam frame = new TabExam();
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
	public TabExam() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		contentPane.add(tabbedPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("탭1", new ImageIcon(TabExam.class.getResource("/ch17_gui/duke7.gif")), panel, null);
		
		JButton btnNewButton = new JButton("버튼1");
		btnNewButton.setIcon(new ImageIcon("/Users/kyeongmin/Downloads/images/zip.gif"));
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("탭2", null, panel_1, null);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("탭3", new ImageIcon(TabExam.class.getResource("/ch16_thread/duke1.gif")), panel_2, null);
		
		JButton btnNewButton_1 = new JButton("버튼3");
		btnNewButton_1.setIcon(new ImageIcon("/Users/kyeongmin/Downloads/images/dot.png"));
		panel_2.add(btnNewButton_1);
	}

}
