package ch18_graphics;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class RandomLine extends Applet {
	private Random random;
	
	// 애플릿을 초기화(화면 출력 전)
	@Override
	public void init() {
		setSize(300, 300);	// 화면 사이즈 설정
		random = new Random();	// 랜덤 객체 생성
	}
	
	@Override
	public void paint(Graphics g) {
		// 화면의 일부부만 사용 : clipRect(x, y, width, height)
		g.clipRect(100, 100, 100, 100);
		for(int i = 0; i < 100; i++) {
			int red = random.nextInt(256);	// 0 ~ 255 사이의 값
			int green = random.nextInt(256);
			int blue = random.nextInt(256);
			g.setColor(new Color(red, green, blue));	// 색상 설정
			int x1 = random.nextInt(300);	// 0 ~ 299 사이의 값
			int y1 = random.nextInt(300);
			int x2 = random.nextInt(300);
			int y2 = random.nextInt(300);
			g.drawLine(x1, y1, x2, y2);	// 선 그리기
		}
	}

}
