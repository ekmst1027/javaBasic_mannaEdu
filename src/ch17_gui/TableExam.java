package ch17_gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TableExam extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TableExam frame = new TableExam();
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
	public TableExam() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		// 테이블의 헤더(header, 제목행) - 1차원 배열로 작성
		String[] title = {"번호", "이름", "입사일"};
		// 테이블의 데이터(rows) - 2차원 배열로 작성
		String[][] data = {
				{"1", "김철수", "2010-03-10"},
				{"2", "김철호", "2011-10-17"},
				{"3", "박민경", "2012-05-20"}
		};
		
		// new JTable(테이더행, 제목행)
		table = new JTable(data, title);
		
		
		scrollPane.setViewportView(table);
	}

}
