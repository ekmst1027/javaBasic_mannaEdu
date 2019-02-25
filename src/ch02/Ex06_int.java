package ch02;

public class Ex06_int {
	public static void main(String[] args) {
		// 정수형 변수에 값을 대입
		int num1 = 100;
		System.out.println(num1);
		System.out.println(Integer.MIN_VALUE); // 최댓값
		System.out.println(Integer.MAX_VALUE); // 최솟값
		System.out.println(Integer.SIZE); // 비트수
		
		// int 4바이트(32bit), long 8바이트(64bit)
		// long 자료형의 숫자 + L
		// overflow(오버플로우)
		long num2 = 2147483648L;
		System.out.println(num2);
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.SIZE);
		
		// 1바이트(8bit)
		byte num3 = 127;
		System.out.println(num3);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.SIZE);
		
	}
}
