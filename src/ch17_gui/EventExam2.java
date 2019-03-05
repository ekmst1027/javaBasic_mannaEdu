package ch17_gui;

import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JOptionPane;

// 이벤트 처리하는 방법
// 2. 현재 클래스에서 인터페이스 구현
public class EventExam2 extends Frame implements WindowListener {
	public EventExam2() {
		addWindowListener(this);
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new EventExam2();
	}

	@Override
	public void windowOpened(WindowEvent e) {
	}

	@Override
	public void windowClosing(WindowEvent e) {
		JOptionPane.showMessageDialog(this, "프로그램을 종료합니다.");
		System.exit(0);
	}

	@Override
	public void windowClosed(WindowEvent e) {
	}

	@Override
	public void windowIconified(WindowEvent e) {
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
	}

	@Override
	public void windowActivated(WindowEvent e) {
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
	}
	

}
