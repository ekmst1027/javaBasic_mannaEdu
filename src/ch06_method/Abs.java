package ch06_method;

public class Abs {
	
	static int abs(int a) {
		// 조건식 ? true일때의 값 : false일때의 값
		return a >= 0 ? a : -a;
	}
	
	public static void main(String[] args) {
		int a = -5;
		System.out.println("a의 값 : " + a);
		System.out.println("a의 절대값 : " + abs(a));
		System.out.println("a의 절대값 : " + Math.abs(a));
	}
}
