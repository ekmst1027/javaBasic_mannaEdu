package ch11_abstract;

import java.awt.Graphics;

// class 클래스 extends 부모클래스 implements 인터페이스
public class DrawLine extends Point implements Draw {
	private int x, y;
	
	public DrawLine(int a, int b, int x, int y) {
		super(a, b);	// 부모클래스의 생성자 호출
		this.x = x;
		this.y = y;
	}

	@Override
	public void paint(Graphics g) {
		g.drawLine(a, b, x, y);
	}

}
