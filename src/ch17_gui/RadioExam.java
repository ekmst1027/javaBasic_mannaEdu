package ch17_gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

// 라디오버튼 - 1개만 선택, 라디오버튼그룹으로 묶어야 함
// 체크박스 - 여러개 선택 가능

// FlowLayout으로 변경
// JRadio 버튼 추가
// 라디오버튼 모두 선택 => 우클릭 => set button group => new standard (버튼 그룹화)
// 라디오버튼 우클릭 => add event handler => item => itemStateChanged (이벤트 처리)
public class RadioExam extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RadioExam frame = new RadioExam();
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
	public RadioExam() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JRadioButton rdoRed = new JRadioButton("Red");
		rdoRed.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				// 배경색상 바꾸기
				contentPane.setBackground(Color.red);
			}
		});
		buttonGroup.add(rdoRed);
		contentPane.add(rdoRed);
		
		JRadioButton rdoGreen = new JRadioButton("Green");
		rdoGreen.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				// 배경색상 바꾸기
				contentPane.setBackground(Color.green);
			}
		});
		buttonGroup.add(rdoGreen);
		contentPane.add(rdoGreen);
		
		JRadioButton rdoBlue = new JRadioButton("Blue");
		rdoBlue.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				// 배경색상 바꾸기
				contentPane.setBackground(Color.blue);
			}
		});
		buttonGroup.add(rdoBlue);
		contentPane.add(rdoBlue);
		
		JRadioButton rdoCyan = new JRadioButton("Cyan");
		rdoCyan.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				// 배경색상 바꾸기
				contentPane.setBackground(Color.cyan);
			}
		});
		buttonGroup.add(rdoCyan);
		contentPane.add(rdoCyan);
	}

}
