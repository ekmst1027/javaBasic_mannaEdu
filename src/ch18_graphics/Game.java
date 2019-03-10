package ch18_graphics;

import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class Game extends JApplet implements KeyListener, Runnable {
	private Image imgBackground;
	private Image imgGunship;
	private Image imgMissile;
	private Image imgEnemy;
	private Image imgHit;
	
	private AudioClip audioFire;
	private AudioClip audioHit;
	
	private int x, y = 270;
	private int mx = x + 10;
	private int my = y - 10;
	private int ex, ey = 50;
	private int moveEx = 10;
	private int hitX, hitY;
	private int point = 1000;
	private boolean hit;
	private List<Missile> mlist = new ArrayList<>();
	private Image offImage;
	private Graphics bg;
	
	@Override
	public void init() {
		setSize(300, 300);
		// 백그라운드 이미지 영역
		offImage = createImage(getWidth(), getHeight());
		bg = offImage.getGraphics();
		imgBackground = Toolkit.getDefaultToolkit().getImage(getClass().getResource("space.png"));
		imgGunship = Toolkit.getDefaultToolkit().getImage(getClass().getResource("gunship.png"));
		imgMissile = Toolkit.getDefaultToolkit().getImage(getClass().getResource("missile.png"));
		imgEnemy = Toolkit.getDefaultToolkit().getImage(getClass().getResource("enemy.png"));
		imgHit = Toolkit.getDefaultToolkit().getImage(getClass().getResource("hit.png"));
		
		audioFire = getAudioClip(getClass().getResource("fire.wav"));
		audioHit = getAudioClip(getClass().getResource("hit.wav"));
		// 키 이벤트 리스너 연결
		addKeyListener(this);
		// 키 입력을 위한 포커스 설정
		setFocusable(true);
		requestFocus();
		// 멀티스레드 생성
		Thread t = new Thread(this);
		t.start();
	}
	
	// 애플릿의 라이프 사이클 (life cycle, 생명주기)
	// init() => start() => paint()
	@Override
	public void start() {
		x = getWidth() / 2 - 15;
		mx = getWidth() / 2 - 2;
		ex = getWidth() - 25;
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		// 사각영역 클리어
		bg.clearRect(0, 0, getWidth(), getHeight());
		// 배경 이미지
		bg.drawImage(imgBackground, 0, 0, this);
		// 비행기
		bg.drawImage(imgGunship, x, y, this);
		// 총알
		for(int i = 0; i < mlist.size(); i++) {
			Missile m = mlist.get(i);
			bg.drawImage(imgMissile, m.getMx(), m.getMy(), this);
		}
		// 총알이 맞으면 폭발 이미지
		if(hit) {
			bg.drawImage(imgHit, hitX, hitY, this);
			hit = false;
		// 맞지 않으면 적비행기 이미지	
		} else {
			bg.drawImage(imgEnemy, ex, ey, this);
		}
		bg.setColor(Color.WHITE);
		bg.drawString("점수 : " + point, 20, 20);
		g.drawImage(offImage, 0, 0, this);
	}

	@Override
	public void run() {
		while(true) {
			for(int i = 0; i < mlist.size(); i++) {
				Missile m = mlist.get(i);
				m.setMy(m.getMy() - 5);	// 총알의 y 좌표값 감소 
				if(m.getMy() == 0) {
					mlist.remove(i);	// 영역을 벗어나면 리스트에서 제거
				}
				Rectangle rect1 = new Rectangle(ex, ey, imgEnemy.getWidth(null),
						imgEnemy.getHeight(null));
				Rectangle rect2 = new Rectangle(m.getMx(), m.getMy(),
						imgMissile.getWidth(null), imgMissile.getHeight(null));
				// A.inertsercts(B) : A와 B가 교집합이 있으면
				if(rect1.intersects(rect2)) {
					audioHit.play();
					hit = true;
					hitX = m.getMx() - 30;
					hitY = m.getMy() - 30;
					point = point + 100;
					setMissilePos();
					ex = getWidth() - 25;
					ey = 0;
					mlist.remove(i);
				}
			}
			ex = ex - moveEx;
			if(ex < 0 || ex > getWidth() - 25) {
				moveEx = -moveEx;
				ey += 10;
			}
			if(ey == (getHeight() - imgGunship.getHeight(this))) {
				int result = JOptionPane.showConfirmDialog(this, "game over, restart?");
				if(result == JOptionPane.NO_OPTION) {
					System.exit(0);
				} else if(result == JOptionPane.YES_OPTION) {
					ex = getWidth() - 25;
					ex = 0;
					point = 1000;
				}
			}
			repaint();
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	void setMissilePos() {
		mx = x + 13;
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch(e.getKeyCode()) {
		case KeyEvent.VK_LEFT:
			x = Math.max(0, x - 5);
			setMissilePos();
			break;
		case KeyEvent.VK_RIGHT:
			x = Math.min(300 - imgGunship.getWidth(null), x + 5);
			setMissilePos();
			break;
		case KeyEvent.VK_F:
			Missile m = new Missile();
			m.setMx(x + imgGunship.getWidth(null)/2);
			m.setMy(y);
			mlist.add(m);
			audioFire.play();
			break;
		}
		repaint();
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}
	

}
