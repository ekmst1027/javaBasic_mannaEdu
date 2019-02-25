package ch04_control;

public class Multi {
	public static void main(String[] args) {
		long num = 20;
		long sum = 1; // 합계를 저장할 변수 
		for(int i = 1; i <= num; i++) {
			sum *= i;
		}
		System.out.println("1부터 " + num + "까지의 곱 : " + sum);
	}
}
