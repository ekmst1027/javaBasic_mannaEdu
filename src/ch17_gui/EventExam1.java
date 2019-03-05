package ch17_gui;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JOptionPane;

// 이벤트 처리하는 방법 
// 1. 익명내부클래스로 구현
public class EventExam1 extends Frame {
	public EventExam1() {
		setSize(300, 300);	// 프레임의 사이즈 설정
		setVisible(true);	// 프레임을 화면에 표시
		// 이벤트소스.이벤트리스너(이벤트핸들러) - 현재 이벤트소스는 this이며 생략되어있음, this는 frame을 가리킴
		// add대상Listener
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				JOptionPane.showMessageDialog(null, "프로그램을 종료합니다.");
				System.exit(0);
			}
		});
		
//		addWindowListener(new WindowListener() {
//			
//			@Override
//			public void windowOpened(WindowEvent e) {
//				
//			}
//			
//			@Override
//			public void windowIconified(WindowEvent e) {
//				
//			}
//			
//			@Override
//			public void windowDeiconified(WindowEvent e) {
//				
//			}
//			
//			@Override
//			public void windowDeactivated(WindowEvent e) {
//				
//			}
//			
//			@Override
//			public void windowClosing(WindowEvent e) {
//				// 메시지박스 출력
//				JOptionPane.showMessageDialog(null, "프로그램을 종료합니다.");
//				System.exit(0);
//			}
//			
//			@Override
//			public void windowClosed(WindowEvent e) {
//				
//			}
//			
//			@Override
//			public void windowActivated(WindowEvent e) {
//				
//			}
//		});
	}
	
	public static void main(String[] args) {
		new EventExam1();
	}

}
