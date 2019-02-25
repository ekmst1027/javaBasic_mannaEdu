package ch03_operator;

public class Condition {
	public static void main(String[] args) {
		int num = -5;
//		조건식 ? 참일때의 값 : 거짓일때의 값
//		System.out.println(num > 0 ? num : -num);
		System.out.println(num > 0 ? num : -num);	// 절대값을 출력하는 코드
		
		if(num > 0) {
			System.out.println(num);
		} else {
			System.out.println(-num);
		}
	}
}
