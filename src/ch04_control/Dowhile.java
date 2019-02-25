package ch04_control;

public class Dowhile {
	public static void main(String[] args) {
		int i = 1;	// 초기식
		do {
			System.out.println(i);
			i++; // 증감식
		} while (i <= 10); // 조건식
	}
}
