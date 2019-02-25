package ch03_operator;

public class Calc {
	public static void main(String[] args) {
		int a = 10;
		int b = 8;
		int c = a/b; 	// 나누기, 몫을 계산
		System.out.println(c);
		c = a % b;		// a를 b로 나눈 나머지
		System.out.println(c);
	}
}
