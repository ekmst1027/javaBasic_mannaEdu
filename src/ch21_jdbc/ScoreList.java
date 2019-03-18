package ch21_jdbc;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

public class ScoreList extends JFrame {
	
	// 추가 코드
	private ScoreDAO dao;
	private Vector<String> col;	// 테이블의 제목행을 구성하기 위한 벡터
	private DefaultTableModel model;	// 테이블에 데이터를 공급하는 객체
	private ScoreDTO dto;

	private JPanel contentPane;
	private JTextField tfStudentNo;
	private JTextField tfName;
	private JTextField tfKor;
	private JTextField tfEng;
	private JTextField tfMat;
	private JTable table;
	private JButton btnSave;
	private JButton btnUpdate;
	private JButton btnDelete;
	private JLabel lblNewLabel_1;
	private JTextField tfSearch;
	private JButton btnSearch;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScoreList frame = new ScoreList();
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
	public ScoreList() {
		dao = new ScoreDAO();	// dao 객체 생성
		col = new Vector();	// 테이블의 타이틀행에 입력할 벡터 생성
		col.add("학번");
		col.add("이름");
		col.add("국어");
		col.add("영어");
		col.add("수학");
		col.add("총점");
		col.add("평균");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 505);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("학번");
		lblNewLabel.setBounds(31, 27, 61, 16);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("이름");
		label.setBounds(31, 62, 61, 16);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("국어");
		label_1.setBounds(31, 95, 61, 16);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("영어");
		label_2.setBounds(31, 135, 61, 16);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("수학");
		label_3.setBounds(31, 172, 61, 16);
		contentPane.add(label_3);
		
		tfStudentNo = new JTextField();
		tfStudentNo.setBounds(110, 22, 130, 26);
		contentPane.add(tfStudentNo);
		tfStudentNo.setColumns(10);
		
		tfName = new JTextField();
		tfName.setBounds(110, 57, 130, 26);
		contentPane.add(tfName);
		tfName.setColumns(10);
		
		tfKor = new JTextField();
		tfKor.setBounds(110, 90, 130, 26);
		contentPane.add(tfKor);
		tfKor.setColumns(10);
		
		tfEng = new JTextField();
		tfEng.setBounds(110, 130, 130, 26);
		contentPane.add(tfEng);
		tfEng.setColumns(10);
		
		tfMat = new JTextField();
		tfMat.setBounds(110, 167, 130, 26);
		contentPane.add(tfMat);
		tfMat.setColumns(10);
		
		btnSave = new JButton("저장");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input();
				int result = dao.insertScore(dto);
				if(result == 1) {
					JOptionPane.showMessageDialog(ScoreList.this, "저장되었습니다.");
					list();	// 테이블 모델 갱신
					table.setModel(model);	// JTable 화면 새로고침
					clear();	// 텍스트필드들을 초기화시킴
				}
			}
		});
		btnSave.setBounds(266, 22, 117, 29);
		contentPane.add(btnSave);
		
		btnUpdate = new JButton("수정");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input();	// 수정한 내용을 dto에 저장
				int result = dao.updateScore(dto);	// 레코드가 수정됨
				if(result == 1) {
					JOptionPane.showMessageDialog(ScoreList.this, "수정되었습니다.");
					list();	// 테이블모델 갱신
					table.setModel(model);	// 화면 새로고침
					clear();	// 텍스트필드 초기화
				}
			}
		});
		btnUpdate.setBounds(266, 57, 117, 29);
		contentPane.add(btnUpdate);
		
		btnDelete = new JButton("삭제");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String student_no = tfStudentNo.getText();
				if(student_no.trim().equals("")) {
					JOptionPane.showMessageDialog(ScoreList.this, "삭제할 내용을 선택하세요.");
					return;
				}
				int result = 0;
				int response = JOptionPane.showConfirmDialog(ScoreList.this, "삭제하시겠습니까?");
				if(response == JOptionPane.YES_OPTION) {
					result = dao.deleteScore(student_no);	// 레코드 삭제
				}
				if(result == 1) {
					JOptionPane.showMessageDialog(ScoreList.this, "삭제되었습니다.");
					list();	// 테이블의 모델 갱신
					table.setModel(model);	// 테이블 내용 변경
					clear();	// 텍스트필드 초기화
				}
			}
		});
		btnDelete.setBounds(266, 101, 117, 29);
		contentPane.add(btnDelete);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(31, 252, 386, 201);
		contentPane.add(scrollPane);
		
		list();	// 테이블 모델의 내용 갱신
		
		table = new JTable(model);	// JTable에 테이블모델을 연결시킴
		scrollPane.setViewportView(table);
		
		lblNewLabel_1 = new JLabel("이름을 입력하세요");
		lblNewLabel_1.setBounds(31, 213, 101, 16);
		contentPane.add(lblNewLabel_1);
		
		tfSearch = new JTextField();
		tfSearch.setBounds(130, 205, 130, 26);
		contentPane.add(tfSearch);
		tfSearch.setColumns(10);
		
		btnSearch = new JButton("검색");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 사용자가 입력한 텍스트
				String name = tfSearch.getText();
				// JTable에 데이터를 공급하는 모델 내용 변경
				model = new DefaultTableModel(dao.searchScore(name), col);
				// JTable의 내용이 변경됨
				table.setModel(model);
			}
		});
		btnSearch.setBounds(266, 205, 117, 29);
		contentPane.add(btnSearch);
		
		// 테이블에 마우스 클릭 이벤트 추가
		table.addMouseListener(new MouseAdapter() {
			// 마우스를 클릭할 때 호출
			@Override
			public void mouseClicked(MouseEvent e) {
				int idx = table.getSelectedRow();	// 현재 클릭한 행의 인덱스
				// getValueAt(행인덱스, 열인덱스)
				tfStudentNo.setText(table.getValueAt(idx, 0) + "");
				tfName.setText(table.getValueAt(idx, 1) + "");
				tfKor.setText(table.getValueAt(idx, 2) + "");
				tfEng.setText(table.getValueAt(idx, 3) + "");
				tfMat.setText(table.getValueAt(idx, 4) + "");
			}
		});
	}
	
	public void list() {
		// new DefaultTableModel(행, 열)
		model = new DefaultTableModel(dao.listScore(), col);
	}
	
	// 텍스트필드에 입력한 내용을 dto로 저장하는 코드
	public void input() {
		String student_no = tfStudentNo.getText();
		String name = tfName.getText();
		int kor = Integer.parseInt(tfKor.getText());
		int eng = Integer.parseInt(tfEng.getText());
		int mat = Integer.parseInt(tfMat.getText());
		dto = new ScoreDTO(student_no, name, kor, eng, mat);
	}
	
	// 텍스트필드에 입력한 내용들을 클리어시키는 코드
	public void clear() {
		tfStudentNo.setText("");
		tfName.setText("");
		tfKor.setText("");
		tfEng.setText("");
		tfMat.setText("");
		tfStudentNo.requestFocus();	// 입력 포커스 이동
		
	}
}

