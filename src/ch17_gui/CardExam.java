package ch17_gui;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

// CardLayout(카드 레이아웃) : 여러장의 화면을 겹쳐놓은 효과 
public class CardExam extends JFrame {
	CardLayout card;	// 카드 레이아웃 객체
	Container con;	// 프레임의 컨텐츠 영역
	
	public CardExam() {
		// 프레임의 컨텐츠 영역을 가져옴
		con = getContentPane();
		card = new CardLayout();
		// 기본 레이아웃을 카드 레이아웃으로 변경
		setLayout(card);
		JPanel[] pan = new JPanel[5];	// JPanel 객체 배열
		Color[] color = {Color.red, Color.yellow, Color.green,
				Color.blue, Color.cyan};	//색상 배열
		for(int i = 0; i < pan.length; i++) {
			pan[i] = new JPanel();	// 패널 생성
			pan[i].setBackground(color[i]);	// 패널의 배경색
			add("card" + i, pan[i]);	// 프레임에 패널 추가
			pan[i].addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
//					card.next(con);	// 다음 화면으로 이동
					card.previous(con);	// 이전 화면으로 이동
				}
			});
			setSize(300, 300);
			setVisible(true);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
	}
	
	public static void main(String[] args) {
		new CardExam();
	}

}
