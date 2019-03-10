package ch18_graphics;

import java.awt.Graphics;

import javax.swing.JFrame;

public class PaintExam extends JFrame {
	public PaintExam() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);	// JFrame의 paint()가 실행됨
		// drawString("문자열", x좌표, y좌표)
		// fill : 색상을 채움, draw : 테두리만 칠함
		g.drawString("hello java", 10, 60);
		g.drawOval(100, 100, 50, 50);
		g.drawRect(200, 200, 60, 60);
		System.out.println("paint 호출....");
	}
	
	public static void main(String[] args) {
		new PaintExam();
	}

}
