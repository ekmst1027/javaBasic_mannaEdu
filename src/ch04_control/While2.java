package ch04_control;

public class While2 {
	public static void main(String[] args) {
		int i = 1;	// 초기식
		int num = 10;
		int sum = 0;
		while(i <= num) {	// 조건식
			sum += i;
			i++;	// 증감식
		}
		System.out.println("1~" + num + "까지의 합계 : " + sum);
	}
}
