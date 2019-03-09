package ch17_gui;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JApplet;

// 마우스이벤트 처리 MouseListener => MouseEvent
public class KeyMouseExam extends JApplet implements MouseListener, MouseMotionListener, KeyListener {
	
	private int x, y;
	private int width, height;
	private Image img;
	
	// 화면 출력 전 초기화 코드
	@Override
	public void init() {
		setSize(300, 300);
		// 이미지 로딩
		img = Toolkit.getDefaultToolkit().getImage(getClass().getResource("duke7.gif"));
		
		// 현재 화면에 마우스 이벤트 연결
		addMouseListener(this);
		addMouseMotionListener(this);
		
		// 현재 화면에 키 이벤트 연결
		addKeyListener(this);
		
		// 키 입력을 받을 수 있도록 설정
		setFocusable(true);
		
		// 현재 화면에 입력포커스 설정
		requestFocus();
	}
	
	// 화면 출력 코드
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		// 이미지를 화면에 출력
		g.drawImage(img, x, y, null);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// 이미지의 가로, 세로 사이즈 계산
		// ImageObserver : 이미지 관찰자
		width = img.getWidth(null);
		height = img.getHeight(null);
		// 클릭한 x, y 좌표 저장 
		x = e.getX() - (width/2);	// 중앙값 기준
		y = e.getY() - (height/2);	// 중앙값 기준
		// 그래픽 수정 요청 => paint()가 호출됨
		repaint();
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
//		System.out.println(e);
//		System.out.println(e.getKeyChar()); // 문자
//		System.out.println(e.getKeyCode());	// 문자 코드
		// 키 코드값에 따라 분기
		switch(e.getKeyCode()) {
		case KeyEvent.VK_UP:
			y = Math.max(0, y-5);
			break;
		case KeyEvent.VK_DOWN:
			y = Math.min(300-height, y+5);
			break;
		case KeyEvent.VK_LEFT:
			x = Math.max(0, x-5);
			break;
		case KeyEvent.VK_RIGHT:
			x = Math.min(300-width, x+5);
			break;
		}
		repaint();	// 그래픽 갱신 요청 => paint()
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println("mouse drag... x:" + e.getX() + ",y:" + e.getY());
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		System.out.println("mouse move... x:" + e.getX() + ",y:" + e.getY());
		
	}

}
