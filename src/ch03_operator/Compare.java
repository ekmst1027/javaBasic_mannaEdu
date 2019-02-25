package ch03_operator;

public class Compare {
	public static void main(String[] args) {
		int a = 65;
		char c = 'A'; // 숫자 65로 저장됨
		// A == B : A와 B가 같다
		
		// 자동형변환 : 작은 자료형을 큰 자료형으로 변환
		
		// char(2) int (4)
		System.out.println(a == c);
		
		// A = B : B의 값을 A에 대입 
		System.out.println(a = c);
		
		// compile error(컴파일 에러)
		// warning(경고)
		// A != B : 같지 않다
		System.out.println('A' != 65);
	}
}
