package ch04_control;

public class Dowhile2 {
	public static void main(String[] args) {
		int i = 1;	// �ʱ��
		int num = 100;
		int sum = 0;
		do {
			sum += i;
			i++; // ������
		} while(i <= num); // ���ǽ�
		System.out.println("1 ~ "+num+"������ �հ� : " + sum);
	}
}
