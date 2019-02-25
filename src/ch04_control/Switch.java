package ch04_control;

public class Switch {
	public static void main(String[] args) {
		int kor = 85;
		int mat = 90;
		int eng = 70;
		
		int tot = kor + eng + mat; // ����
		double avg = tot / 3.0;	// ���
		
		String grade = "";	// ���(����̾簡)
		
		// switch(���ǽ�) : ���ǽĿ��� ����, ���ڿ��� ����
		// case ��:
		// ���ǿ� �´� ��(label)�� �̵�
		// break : switch ������ ���(Ż�⹮)
		// default : ������ ��� ���̽�
		switch( (int)(avg / 10) ) {	// double�� int�� ��ȯ
			case 10:
			case 9:
				grade = "��";
				break;
			case 8:
				grade = "��";
				break;
			case 7:
				grade = "��";
				break;
			case 6:
				grade = "��";
				break;
			default:
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
