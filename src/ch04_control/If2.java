package ch04_control;

public class If2 {
	public static void main(String[] args) {
		// String[] args ����� �Ű����� command line arguments
		// Integer.parseInt(���ڿ�) ���ڿ��� ���ڷ�
		// args[0] ù��° ����� �Ű�����
		// �迭��������.length => �迭�� ������(����� ����)
		// �迭��������[�ε���] 0����
		for(int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		int num = Integer.parseInt(args[0]);
		if(num % 2 == 0) {
			System.out.println(num + "�� ¦���Դϴ�.");
		} else {
			System.out.println(num + "�� Ȧ���Դϴ�.");
		}
	}
}
