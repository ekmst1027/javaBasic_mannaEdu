package ch02;

public class Ex04_char {
	public static void main(String[] args) {
		// 문자형 변수 선언
		// null 문자
		char ch = '\0'; // 작은 따옴표로 묶음 
		System.out.println(ch);
		// cast 연산자 (자료형 변환)
		// 문자값을 숫자값으로 변환
		System.out.println((int)ch);
		System.out.println(65);
		System.out.println((char)65);
		
		// 반복문
		// for(초기식; 조건식; 증가감소식)
//		for(int i = 0; i < 255; i++) {
//			System.out.println(i + "==>" + (char)i);
//		}
//		for(int i = '가'; i <= '하'; i++) {
//			System.out.println(i + "==>" + (char)i);
//		}
		
		String str = ""; // 빈 문자열을 가리킴
		System.out.println(str);
		str = null; // 가리키는 내용이 없음
		str = " "; // 공백 문자를 가리킴
	}
}
