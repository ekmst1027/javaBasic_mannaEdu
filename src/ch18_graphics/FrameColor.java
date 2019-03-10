package ch18_graphics;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;

import javax.swing.JFrame;

public class FrameColor extends JFrame {
	public FrameColor() throws InterruptedException {
		setVisible(true);	// 프레임을 화면에 표시
		Container c = getContentPane();	// 프레임의 컨텐츠 영
		for(int i = 0; i <= 255; i++) {
			setSize(i * 2, i);	// 프레임의 크기 설정
			setLocation(i * 2, i);	// 프레임이 출력될 좌표 설정
			c.setBackground(new Color(i, 0, 0));	// 배경색상 설정
			Thread.sleep(10);
		}
		
		for(int i = 0; i <= 255; i++) {
			setSize(i * 2, i);
			setLocation(i * 2, i);
			c.setBackground(new Color(255, i, 0));
			Thread.sleep(10);
		}
		setDefaultCloseOperation(EXIT_ON_CLOSE);	// 닫기 동작 설정
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		System.out.println("paint.....");
	}
	
	public static void main(String[] args) throws InterruptedException {
		new FrameColor();
	}

}
