package ch16_thread;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

// 애플릿(applet) - 웹브라우저에서 실행되는 자바 프로그램
// java 9 버전부터 deprecated 클래스(비추천 클래스)
public class Ball extends Applet implements Runnable, ComponentListener {
	
	private int x = 0, y = 0;
	private int mx = 2, my = 3;
	private int width = 300, height = 300;

	// 애플릿을 초기화시키는 코드
	public void init() {
		// 현재 클래스에 컴포넌트 리스너 추가
		// 컴포넌트 리스너 : 화면 사이즈 변경 및 움직임을 감지
		addComponentListener(this);
		
		// 백그라운드 스레드 생성
		Thread t = new Thread(this);
		// 백그라운드 스레드 실행 요청
		t.start();	// run()이 호출됨
		
		// 배경색상 설정
		setBackground(Color.yellow);
		// 화면 사이즈 설정
		setSize(300, 300);
	}
	
	
	public void paint(Graphics g) {
		g.setColor(Color.red);	// 색상 설정
		// 타원 그리기(x, y, width, height)
		g.fillOval(x, y, 30, 30);
		g.setColor(Color.blue);
		// 문자열 출력(문자열, x좌표, y좌표)
		g.drawString("hello", y, x);
		
	}
	
	// 백그라운드 스레드 - x, y 좌표값 변경
	// 메인 스레드 - 그래픽 처리
	
	@Override
	public void run() {
		while(true) {
			// x, y 좌표값 변경
			if(x > (width - 30) || x < 0) {	// 좌우벽에 맞으면
				mx = -mx;	// x축의 방향 전환
			}
			x = x + mx;
			
			
			if(y > (height - 30) || y < 0) { // 상하벽에 맞으면
				my = -my;	// y축의 방향 전환
			}
			y = y + my;
			
			
			System.out.println(x + ", " + y);
			// 그래픽 화면을 새로 그려달라고 요청
			repaint();	// paint()가 실행됨
			try {
				Thread.sleep(30);	// 잠시 멈춤
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
		}
		
	}

	@Override
	public void componentHidden(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void componentMoved(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}

	// 화면 사이즈가 바뀔 때 실행되는 코드
	@Override
	public void componentResized(ComponentEvent e) {
		width = getWidth();	// 현재 화면의 가로 사이즈 저장
		height = getHeight();	// 현재 화면의 세로 사이즈 저장
	}

	@Override
	public void componentShown(ComponentEvent e) {
		// TODO Auto-generated method stub
		
	}

}
