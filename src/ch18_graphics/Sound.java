package ch18_graphics;

import java.applet.AudioClip;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;

public class Sound extends JApplet implements ActionListener {
	private AudioClip audio;
	private JButton play, stop, loop;
	
	@Override
	public void init() {
		// 화면 레이아웃 변경(애플릿의 기본 레이아웃-BorderLayout)
		setLayout(new FlowLayout());
		// 현재 클래스가 실행 중인 디렉토리의 리소스를 불러옴
		audio = getAudioClip(getClass().getResource("dingdong.wav"));
		play = new JButton("paly");
		stop = new JButton("stop");
		loop = new JButton("loop");
		
		// 버튼을 애플릿에 붙임
		add(play);
		add(stop);
		add(loop);
		
		// 버튼 클릭 이벤트 기능 추가
		// 이벤트소스.이벤트리스너(이벤트핸들러)
		play.addActionListener(this);
		stop.addActionListener(this);
		loop.addActionListener(this);
	}
	
	// 버튼을 클릭하면 자동으로 실행되는 코드
	@Override
	public void actionPerformed(ActionEvent e) {
		// e.getSource() : actionPerformed()를 호출한 컴포넌트의 정보
		JButton btn = (JButton) e.getSource();
		if(btn == play) {
			audio.play();// 사운드 재생
		} else if(btn == stop) {
			audio.stop();	// 사운드 재생 중지
		} else if(btn == loop) {
			audio.loop();	// 사운드 반복 재생
		}
	}
}
