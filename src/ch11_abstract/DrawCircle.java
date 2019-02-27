package ch11_abstract;

import java.awt.Graphics;

// class 클래스 extends 부모클래스 implements 인터페이스
public class DrawCircle extends Point implements Draw {
	private int width, height;
	public DrawCircle() {
		this(0, 0, 0, 0); // 생성자 호출
	}
	
	public DrawCircle(int a, int b, int w, int h) {
		super(a, b);	// 부모클래스의 생성자 호출
		width = w;
		height = h;
	}
	
	// Graphics : 자바의 내장 그래픽 처리 클래스
	@Override
	public void paint(Graphics g) {
		// 타원그리기
		g.drawOval(a, b, width, height);
	}

}
