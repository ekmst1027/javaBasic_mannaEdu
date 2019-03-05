package ch17_gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

// 이벤트 처리 방식
// 1. 익명 내부 클래스 방식 - 코드 중복
// 2. 클래스 레벨에서 인터페이스 구현 방식
// 3. 이벤트 처리를 외부 클래스에서 구현 방식 - 재사용성
public class MyColorAction implements ActionListener {
	private Color c;	// 색상변수
	private Container con;	// 컨테이너 변수
	
	// 생성자
	public MyColorAction(JFrame f, Color c) {
		con = f.getContentPane();	// 프레임의 컨텐츠 영역
		this.c = c;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		con.setBackground(c);	// 배경색상 변경
	}

}
