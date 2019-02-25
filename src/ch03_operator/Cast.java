package ch03_operator;

public class Cast {
	public static void main(String[] args) {
		// float 4바이트, double 8바이트
		// 실수값 => 8바이트로 저장
		// 실수값F(f) => 4바이트로 저장 
		
		float f = 1.6F;	// 4바이트로 저장
		System.out.println(f);
		
		f = 100; // 자동형변환(작은 자료형 => 큰 자료형)
		System.out.println(f);
		
		// 강제형변환(명시적 형변환)
		// (자료형) => cast 연산자
		f = 100.5f; 
		int i = (int)f;
		System.out.println(i);
		
		i = 300;
		// -128 ~ 127
		// 큰 자료형을 작은 자료형으로 바꿀 경우 
		// 정밀도가 떨어지거나 값이 손실될 수 있음
		byte b = (byte)i;	
		System.out.println(b);
	}
}
