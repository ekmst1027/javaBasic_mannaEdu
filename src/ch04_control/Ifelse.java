package ch04_control;

public class Ifelse {
	public static void main(String[] args) {
		int kor = 85;
		int mat = 90;
		int eng = 70;
		
		int tot = kor + eng + mat; // ����
		double avg = tot / 3.0;	// ���
		
		String grade = "";	// ���(����̾簡)
		
		if(avg >= 90) {
			grade = "��";
		} else if(avg >= 80) {
			grade = "��";
		} else if(avg >= 70) {
			grade = "��";
		} else if(avg >= 60) {
			grade = "��";
		} else {
			grade = "��";
		}
		
		// ��� ���
		System.out.println("����\t����\t����\t����\t���\t���");
		// String.format("�������", ����Ұ�)
		// % ������ ���� ��µ� ��ġ
		// %.1f �Ǽ���(�Ҽ�ù°�ڸ����� ���), ��ü�ڸ����� �ڵ�
		// ������� : %s ���ڿ�����, %d ������, %f �Ǽ���
		System.out.println(
				kor+"\t"+eng+"\t"+mat+"\t"+tot+"\t"+String.format("%.1f", avg)+"\t"+grade
				);
		System.out.printf(
				"%d\t%d\t%d\t%d\t%.1f\t%s",
				kor,eng,mat,tot,avg,grade
				);
		
	}
}
