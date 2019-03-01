package ch13_useful;

public class Wrapper {
	public static void main(String[] args) {
		// 랩퍼 클래스 객체 생성
//		Integer i1 = new Integer(10);
		Integer i1 = 10;	// auto boxing
//		Integer i2 = new Integer(20);
		Integer i2 = 20;
		// int num1 = i1; // 좌변은 기본자료형(값 저장), 우변은 참조변수(주소 저장)
		int num1 = i1.intValue();	// 내부적으로 자동 변환(auto unboxing)
		int num2 = i2;
		int sum = num1 + num2;
		System.out.println(sum);
		// 다양한 메소드 호출
		System.out.println(Integer.toBinaryString(sum));	// 2진수로 출력
		System.out.println(Integer.toOctalString(sum));	// 8진수
		System.out.println(Integer.toHexString(sum));	// 16진수
		System.out.println(Integer.MAX_VALUE);	// int의 최댓값
		System.out.println(Integer.MIN_VALUE);	// int의 최솟값
		System.out.println(Integer.parseInt("100"));	// 문자열을 정수로 변환
		System.out.println(Integer.toString(100));	// 정수를 문자열로 변환 
		System.out.println(100+"");	// 정수를 문자열로 변환
		
	}
}
