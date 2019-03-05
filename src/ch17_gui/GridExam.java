package ch17_gui;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

// JFrame의 기본 레이아웃 : BorderLayout
public class GridExam extends JFrame {
	public GridExam() {
		// 기본 레이아웃을 사용하지 않고
		// 그리드 레이아웃(2행 3열)으로 변경
//		setLayout(new GridLayout(2,3));
		setLayout(new FlowLayout());
		for(int i = 1; i <= 6; i++) {
			JButton button = new JButton("버튼" + i);	// 버튼 생성
			add(button);	// 프레임에 버튼을 붙임 
		}
		setSize(300, 300);	// 프레임 사이즈 설정
		setVisible(true);	// 프레임을 화면에 표시
		setDefaultCloseOperation(EXIT_ON_CLOSE);	// 닫기 설정
	}
	
	public static void main(String[] args) {
		new GridExam();
	}

}
