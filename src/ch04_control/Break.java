package ch04_control;

public class Break {
	public static void main(String[] args) {
		int i = 1;
		while(true) {	// ���ѹݺ�
			System.out.println(i++);
			if(i > 10) break;	// �ݺ����� ���(Ż�⹮)
		}
	}
}
