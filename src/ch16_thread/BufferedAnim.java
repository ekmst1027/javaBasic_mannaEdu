package ch16_thread;

import java.applet.Applet;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

// 그래픽 애니메이션(더블 버퍼링 적용 버전)
public class BufferedAnim extends Applet implements Runnable {

	private Image[] img;	// 이미지 객체배열
	private int idx;	// 이미지의 인덱스
	private Image offImage;	// 백그라운드 이미지 객체
	private Graphics bg;	// 백그라운드 그래픽 처리 객체
	
	public void init() {
		img = new Image[10];	// 이미지 객체 배열 생성
		// 이미지 10장을 불러옴
		for(int i = 0; i < img.length; i++) {
			img[i] = Toolkit.getDefaultToolkit().getImage(getClass().getResource("duke" + (i+1) + ".gif"));
		}
		
		// 백그라운드 스레드 생성
		Thread t = new Thread(this);
		// 백그라운드 스레드 실행 요청 => run()이 실행됨
		t.start();
	}
	
	// 백그라운드 스레드가 실행하는 코드
	public void run() {
		while(true) {
			idx++;	// 이미지의 인덱스 증가
			if(idx >= 10) {	// 10이 되면 다시 0으로
				idx = 0;
			}
			
			// 그래픽 화면 갱신 요청
			// repaint() => update() => paint()
			repaint();
			try {
				Thread.sleep(30);	// 잠시 멈춤
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	// 화면에 출력되기 전에 변경사항을 처리하는 코드
	@Override
	public void update(Graphics g) {
		Dimension d = getSize();	// 현재 화면의 사이즈 계산
		if(offImage == null) {	// 백그라운드 이미지가 null이면
			// 백그라운드 이미지 생성
			offImage = createImage(d.width, d.height);
			// 백그라운드 이미지에 출력할 그래픽 객체 생성
			bg = offImage.getGraphics();
		}
		// getBackground() : 현재 화면의 배경색상
		bg.setColor(getBackground());	// 그래픽 색상 설정
		// 사각형 그리기(전에 출력한 그림을 지우는 효과)
		bg.fillRect(0, 0, d.width, d.height);
		// 이미지 출력
		bg.drawImage(img[idx], 0, 0, null);
		// paint() 호출
		paint(g);
	}
	
	// 그래픽 처리 코드(화면 출력 처리)
	public void paint(Graphics g) {
		if(offImage != null) {	// 백그라운드 이미지가 존재하면
			// 백그라운드 이미지를 현재 화면에 출력시킴
			g.drawImage(offImage, 90, 73, null);
		}
	}

}
