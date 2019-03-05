package ch17_gui;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

// WindowListener - 인터페이스, 7개의 추상 method
// WindowAdapter - WindowListener를 구현한 클래스
public class FrameExam {
	public static void main(String[] args) {
		// 프레임 생성
		Frame f = new Frame();
		// 프레임의 제목 설정
		f.setTitle("프레임 테스트");
		// 프레임의 가로, 세로 사이즈 설정
		f.setSize(300, 300);
		// 프레임을 화면에 표시
		f.setVisible(true);
		
		// 프레임에 윈도우이벤트를 감시하는 리스너 기능을 붙임
		// 윈도우가 닫히면 프로그램을 갖에로 종료함
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);	// 0 : 정상적인 종료
			}
		});
		
//		f.addWindowListener(new WindowListener() {
//			
//			@Override
//			public void windowOpened(WindowEvent e) {
//			}
//			
//			@Override
//			public void windowIconified(WindowEvent e) {
//			}
//			
//			@Override
//			public void windowDeiconified(WindowEvent e) {
//			}
//			
//			@Override
//			public void windowDeactivated(WindowEvent e) {
//			}
//			
//			@Override
//			public void windowClosing(WindowEvent e) {
//				System.exit(0);
//			}
//			
//			@Override
//			public void windowClosed(WindowEvent e) {
//			}
//			
//			@Override
//			public void windowActivated(WindowEvent e) {
// 			}
//		});
		
		
		
		
	}
}
