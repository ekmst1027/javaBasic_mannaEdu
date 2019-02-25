package ch05_array;

public class ArraySum {
	public static void main(String[] args) {
		int[] num = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		int sum = 0;
		for(int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		System.out.println("합계 : " + sum);
	}
}
