package ch17_gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ButtonEventExam extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ButtonEventExam frame = new ButtonEventExam();
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
	public ButtonEventExam() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// setBounds(x좌표, y좌표, 가로길이, 세로길이)
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		// 프레임의 컨텐츠 영역에 JPanel 배치
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnYello = new JButton("Yellow");
		btnYello.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 배경색상 변경
				contentPane.setBackground(Color.yellow);
			}
		});
		contentPane.add(btnYello);
		
		JButton btnRed = new JButton("Red");
		btnRed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 배경색상 변경
				contentPane.setBackground(Color.red);
			}
		});
		contentPane.add(btnRed);
		
		JButton btnGreen = new JButton("Green");
		btnGreen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 배경색상 변경
				contentPane.setBackground(Color.green);
			}
		});
		contentPane.add(btnGreen);
		
		JButton btnCyan = new JButton("Cyan");
		btnCyan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 배경색상 변경
				contentPane.setBackground(Color.cyan);
			}
		});
		contentPane.add(btnCyan);
	}

}
