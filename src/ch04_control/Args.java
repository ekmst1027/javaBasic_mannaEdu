package ch04_control;

public class Args {
	public static void main(String[] args) {
		// �迭��������.length => �迭�� ��� ����
		// �迭��������[�ε���] => 0����
		for(int i = 0; i < args.length; i++) {
			System.out.println(i + "��° �Ű����� : " + args[i]);
		}
	}
}
