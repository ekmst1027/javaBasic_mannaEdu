package ch04_control;

public class Multi {
	public static void main(String[] args) {
		long num = 20;
		long sum = 1; // �հ踦 ������ ���� 
		for(int i = 1; i <= num; i++) {
			sum *= i;
		}
		System.out.println("1���� " + num + "������ �� : " + sum);
	}
}
