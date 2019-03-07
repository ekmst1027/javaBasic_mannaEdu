package ch17_gui;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.metal.MetalSliderUI;

// 슬라이더, 라벨 패널 배치
// 슬라이더는 전역변수로
// 슬라이더의 max값 변경
// 전역변수 추가
// change 이벤트 구현
// 슬라이더의 세부 옵션 - 눈금, 숫자 표시 majorTick, minorTick, paintLabels, paintTicks
public class SliderExam extends JFrame {

	private JPanel contentPane;
	int red, green, blue;
	private JSlider sliderR;
	private JSlider sliderG;
	private JSlider sliderB;
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SliderExam frame = new SliderExam();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SliderExam() {
		panel = new JPanel();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 379, 518);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		sliderR = new JSlider();
		sliderR.setMinorTickSpacing(10);
		sliderR.setMajorTickSpacing(40);
		sliderR.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				// 슬라이더의 값을 저장
				red = sliderR.getValue();
				// 패널의 배경색상 변경
				panel.setBackground(new Color(red, green, blue));
			}
		});
		sliderR.setPaintTicks(true);
		sliderR.setPaintLabels(true);
		sliderR.setValue(0);
		sliderR.setMaximum(255);
		sliderR.setBounds(115, 25, 190, 29);
		contentPane.add(sliderR);
		
		sliderG = new JSlider();
		sliderG.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				// 슬라이더의 값을 저장
				green = sliderG.getValue();
				// 패널의 배경색상 변경
				panel.setBackground(new Color(red, green, blue));
			}
		});
		
		sliderG.setPaintTicks(true);
		sliderG.setPaintLabels(true);
		sliderG.setMinorTickSpacing(10);
		sliderG.setMajorTickSpacing(40);
		sliderG.setValue(0);
		sliderG.setMaximum(255);
		sliderG.setBounds(115, 81, 190, 29);
		contentPane.add(sliderG);
		
		sliderB = new JSlider();
		sliderB.addChangeListener(new ChangeListener() {
			// 슬라이더의 값이 변경될 때 실행되는 코드
			public void stateChanged(ChangeEvent e) {
				// 슬라이더의 값을 저장
				blue = sliderB.getValue();
				// 패널의 배경색상 변경
				panel.setBackground(new Color(red, green, blue));
			}
		});
		
		// 슬라이더에 마우스 클릭 이동 기능 추가
//		sliderB.setUI(new MetalSliderUI() {
//			protected void scrollDueToClickInTrack(int direction) {
//				// 마우스 클릭한 위치의 슬라이더값
//				blue = valueForXPosition(sliderB.getMousePosition().x);
//				sliderB.setValue(blue);	// 슬라이더의 값 변경
//				// 패널의 배경색상 변경
//				panel.setBackground(new Color(red, green, blue));
//			}
//		});
		
		sliderB.setMinorTickSpacing(10);	// 작은 눈금
		sliderB.setMajorTickSpacing(40);	// 큰 눈금
		sliderB.setPaintTicks(true);	// 굵기
		sliderB.setPaintLabels(true);	// 눈금표시
		sliderB.setValue(0);
		sliderB.setMaximum(255);
		sliderB.setBounds(115, 133, 190, 29);
		contentPane.add(sliderB);
		
		
		panel.setBounds(32, 225, 320, 242);
		contentPane.add(panel);
		
		JLabel lblNewLabel = new JLabel("Red");
		lblNewLabel.setBounds(22, 25, 61, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Green");
		lblNewLabel_1.setBounds(22, 83, 61, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Blue");
		lblNewLabel_2.setBounds(22, 146, 61, 16);
		contentPane.add(lblNewLabel_2);
	}
}
