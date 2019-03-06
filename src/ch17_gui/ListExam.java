package ch17_gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

// 화면 배치
// 리스트 모델은 디자이너로 하지 말고 코드로 작성
// 멤버변수에 model 추가
// 엔터키 입력 가능하도록 TextField에 ActionEvent 추가
public class ListExam extends JFrame {

	private JPanel contentPane;
	private JTextField tf;
	private JList list;
	
	// JList에 목록을 출력하기 위하여 모델 추가
	private DefaultListModel<String> model;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListExam frame = new ListExam();
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
	public ListExam() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		tf = new JTextField();
		// 텍스트필드에서 엔터키를 입력했을 때
		tf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.addElement(tf.getText());
				tf.setText("");
				tf.requestFocus();
			}
		});
		panel.add(tf);
		tf.setColumns(10);
		
		JButton btnAdd = new JButton("추가");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 텍스트필드에 입력한 내용을 모델에 추가(리스트가 갱신됨)
				model.addElement(tf.getText());
				// 입력커서 이동
				tf.setText("");
				tf.requestFocus();
			}
		});
		panel.add(btnAdd);
		
		JButton btnDelete = new JButton("삭제");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// JList에서 선택된 아이템의 인덱스값
				int index = list.getSelectedIndex();
				// 인덱스값에 해당하는 내용을 삭제
				if(index != -1) {
					model.remove(index);
				} else {	// 인덱스가 -1이면(선택된 내용이 없으면)
					JOptionPane.showMessageDialog(null, "삭제할 내용을 선택하세요.");
				}
				
			}
		});
		panel.add(btnDelete);
		
		// JList에 추가할 모델 작성
		model = new DefaultListModel<>();
		model.addElement("서울");
		model.addElement("부산");
		model.addElement("대전");
		model.addElement("인천");
		model.addElement("춘천");
		
		// JList에 모델을 연결시킴
		list = new JList<String>(model);
		contentPane.add(list, BorderLayout.CENTER);
	}

}
