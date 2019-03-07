package ch17_gui;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.util.Random;

// Canvas : 그래픽 처리를 위한 컴포넌트
// Runnable : 멀티스레드 구현을 위한 인터페이스
// ComponentListener : 화면사이즈 변경을 감지하기 위한 인터페이스
public class BallCanvas extends Canvas implements Runnable, ComponentListener {
	
	// member field
	private int x, y;
	private int moveX = 2, moveY = 3;
	private int red, green, blue;
	private Random random;
	private int width, height;
	// 더블버퍼링 처리를 위한 변수 추가
	// 백그라운드 이미지 영역(도화지 역할)
	private Image offImage;
	// 백그라운드 이미지에 그래픽 출력을 위한 객체(붓 역할)
	private Graphics bg;
	
	public BallCanvas() {
		// 화면 변경 사항을 감지하기 위한 리스너 추가
		addComponentListener(this);
		// 색상 변경 처리를 위한 랜덤 객체 생성
		random = new Random();
		// 좌표값 변경을 위한 백그라운드 스레드 생성
		Thread thread = new Thread(this);
		// 백그라운드 스레드 시작 요청
		thread.start();	// run()가 호출됨
	}
	
	// repaint() => update() => paint()
	// 그래픽 화면에 출력하기 전에 실행되는 코드
	@Override
	public void update(Graphics g) {
		Dimension d = getSize();	// 화면 사이즈 계산
		// 백그라운드 이미지를 한번만 생성
		if(offImage == null) {
			offImage = createImage(d.width, d.height);
			bg = offImage.getGraphics();
		}
		bg.setColor(getBackground());	// 배경색상
		bg.fillRect(0, 0, d.width, d.height);	// 화면 클리어
		bg.setColor(new Color(red, green, blue));
		bg.fillOval(x, y, 20, 20);
		paint(g);
	}
	
	// 그래픽 처리 코드
	public void paint(Graphics g) {
		if(offImage != null) {
			g.drawImage(offImage, 0, 0, null);
		}
//		// 색상 설정
//		g.setColor(new Color(red, green, blue));
//		// 타원그리기 : fillOval(x, y, width, height)
//		g.fillOval(x, y, 20, 20);
	}

	@Override
	public void componentResized(ComponentEvent e) {
		// 현재 실행 중인 화면의 가로, 세로 길이 계산
		width = getWidth();
		height = getHeight();
		// 화면 사이즈가 변경되면 백그라운드 이미지와 백그라운드에 출력할 그래픽 객체를 새로 만들어야 함
		offImage = createImage(width, height);
		bg = offImage.getGraphics();
	}

	@Override
	public void componentMoved(ComponentEvent e) {
	}

	@Override
	public void componentShown(ComponentEvent e) {
	}

	@Override
	public void componentHidden(ComponentEvent e) {
	}
	
	void setColor() {
		// new Color(red, green, blue)
		red = random.nextInt(256);	// 0 ~ 255 중 랜덤
		green = random.nextInt(256);
		blue = random.nextInt(256);
	}

	@Override
	public void run() {
		while(true) {
			// 좌우 벽처리
			if(x > (width - 20) || x < 0) {
				moveX = -moveX;	// 증가, 감소 방향 설정
				setColor();
			}
			// 상하 벽처리
			if(y > (height - 20) || y < 0) {
				moveY = -moveY;
				setColor();
			}
			x += moveX;	// x좌표값 변경
			y += moveY;	// y좌표값 변경
			repaint();	// 그래픽 갱신 요청 => paint()가 실행됨
			try {
				Thread.sleep(30);	// 잠시 멈춤
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
