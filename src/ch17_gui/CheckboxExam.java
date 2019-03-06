package ch17_gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

//라디오버튼 - 1개만 선택, 라디오버튼그룹으로 묶어야 함
//체크박스 - 여러개 선택 가능

// North에 Panel, Panel 내부에 JCheckBox
// South에 Button
// Center에 ScrollPane
// TextArea를 ScrollPane의 Viewport 영역에 배치
// TextArea를 field 변수로 변환
// 이벤트 처리 - 개별로 하고, 전체를 묶어서 하려면 코드를 직접 수정, AbstractAction으로 해도 코드를 수정해야 함
public class CheckboxExam extends JFrame {

	private JPanel contentPane;
	private JTextArea ta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckboxExam frame = new CheckboxExam();
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
	public CheckboxExam() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		JCheckBox ckJava = new JCheckBox("자바");
		ckJava.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				putResult(e);
			}
		});
		panel.add(ckJava);
		
		JCheckBox ckC = new JCheckBox("C언어");
		ckC.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				putResult(e);
			}
		});
		panel.add(ckC);
		
		JCheckBox ckIot = new JCheckBox("사물인터넷");
		ckIot.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				putResult(e);
			}
		});
		panel.add(ckIot);
		
		JCheckBox ckDB = new JCheckBox("데이터베이스");
		ckDB.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				putResult(e);
			}
		});
		panel.add(ckDB);
		
		JButton btnExit = new JButton("종료");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		contentPane.add(btnExit, BorderLayout.SOUTH);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		ta = new JTextArea();
		scrollPane.setViewportView(ta);
	}
	
	void putResult(ItemEvent e) {
		// e.getSource() : 이벤트를 발생시킨 컴포넌트의 주소값
		JCheckBox ck = (JCheckBox)e.getSource();
		
		// ItemEvent.SELECTED : 체크상태
		// ItemEvent.DESELECTED : 체크해제상태
		// JTextArea.append() : 텍스트를 추가
		// setText() : 문자열 내용 변경
		// append() : 문자열 추가
		if(e.getStateChange() == ItemEvent.SELECTED) {
			ta.append(ck.getText() + "를 신청했습니다\n");
		} else if(e.getStateChange() == ItemEvent.DESELECTED) {
			ta.append(ck.getText() + "를 취소했습니다\n");
		}
	}

}
