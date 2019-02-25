package ch02;

public class Ex07_double {
	public static void main(String[] args) {
//		int num1 = 0.7;
//		double num1 = 0.7;
		// Math : 수학 계산을 위한 명령어들을 제공하는 클래스
		double num1 = Math.PI;
		System.out.println(num1);
		
		// 4.9E-324
		System.out.println(Double.MIN_VALUE);
		// 1.7976931348623157E308
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.SIZE);
		
		// 컴파일 에러(error)
		// 경고(warning)
		
		// 실수값+F(f) => float 자료형으로 저장(4바이트)
		float num2 = 3.14f;
		System.out.println(num2);
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.SIZE);
		
	}
}
