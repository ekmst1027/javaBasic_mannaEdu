package ch18_graphics;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JApplet;

public class StringLine extends JApplet {
	@Override
	public void init() {
//		setBackground(Color.yellow);	// 배경색상 설정
		getContentPane().setBackground(new Color(255, 255, 0));
		setSize(300, 300);	// 화면 크기 설정
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.blue);	// 색상 설정
		g.drawLine(250, 50, 30, 160);	// 선그리기
		g.setColor(Color.red);
		g.drawString("Red string", 10, 50);	// 문자ㅕㅇㄹ 출력
		g.setColor(Color.GREEN);
		g.drawString("Green string", 10, 80);
		g.setColor(Color.blue);
		g.drawString("Blue string", 10, 110);
	}
}
