package ch16_thread;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

// 더블 버퍼링(double buffering)
// 버퍼(buffer) 임시 메모리
public class BufferedBall extends Applet implements Runnable {
	
	private int x, y;	// 원의 좌표
	private int moveX = 2, moveY = 3;	// x, y축의 이동거리
	private int width, height;	// 화면 가로, 세로 사이즈
	
	// 백그라운드 이미지에 그래픽 처리를 하기 위한 객체
	private Graphics bg;
	private Image offScreen;	// 백그라운드 이미지 객체
	private Dimension dim;	// 화면의 가로, 세로 크기 계산
	
	// 애플릿을 초기화시키는 코드
	public void init() {
		setSize(300, 300);	// 화면의 가로, 세로 사이즈 설정
		dim = getSize();	// 화면 사이즈를 저장
		// 백그라운드 이미지 생성
		// createImage(가로, 세로)
		offScreen = createImage(dim.width, dim.height);
		// 백그라운드 이미지에 그래픽 처리를 하기 위한 객체 생성
		bg = offScreen.getGraphics();
		Thread t = new Thread(this);	// 백그라운드 스레드 생성
		t.start();	// 백그라운드 스레드 시작 요청
	}
	
	public void run() {
		while(true) {	// 무한반복
			if(x > (dim.width - 30) || x < 0) {	// 좌우 벽처리
				moveX = -moveX;	// x축 이동방향 바꾸기
			}
			x = x + moveX;	// x좌표값 변경
			
			if(y > (dim.height - 30) || y < 0) {	// 상하 벽처리
				moveY = -moveY;	// y축 이동방향 바꾸기
			}
			y = y + moveY;	// y좌표값 변경
			repaint();	// 그래픽 화면 갱신 요청 => paint() 호출
			try {
				Thread.sleep(50);	// 잠시 멈춤
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void paint(Graphics g) {
		// 백그라운드 이미지에 그래픽 처리
		bg.setColor(Color.yellow);	// 색상 설정
		// 사각형 그리기 fillRect(x1, y1, x2, y2)
		bg.fillRect(0, 0, getWidth(), getHeight());
		bg.setColor(Color.green);
		// 타원 그리기(x, y, width, height)
		bg.fillOval(x, y, 30, 30);
		bg.setColor(Color.blue);
		// 문자열 출력(문자열, x좌표, y좌표)
		bg.drawString("hello", y, x);
		// 그래픽 화면에 백그라운드 이미지를 출력
		// drawImage(이미지, x좌표, y좌표, 이미지관찰객체)
		g.drawImage(offScreen, 0, 0, this);
	}
}
