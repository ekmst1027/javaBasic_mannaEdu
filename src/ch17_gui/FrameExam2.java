package ch17_gui;

import javax.swing.JFrame;

// awt
// swing
public class FrameExam2 {
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("프레임 테스트");
		f.setSize(200, 300);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);	// 디폴트로 사용됨
		
	}
}
