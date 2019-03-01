package ch13_useful;

import java.util.Random;

public class Rand {
	public static void main(String[] args) {
		Random r = new Random();
		// 정수 범위 내에서 선택
		System.out.println(r.nextInt());
		// nextInt(n) 0 ~ n-1 범위 내에서 선택
		System.out.println(r.nextInt(100));	// 0 ~ 99까지
		System.out.println(r.nextInt(101) + 100); // 100 ~ 200까지
		System.out.println(r.nextBoolean());	// true, false 중에서 선택
		System.out.println(r.nextDouble());	// 실수형 난수
		System.out.println(r.nextLong());	// 
		
		// Math m = new Math()가 안됨. 생성자가 private임 대신 static method로 만들어져있음
		System.out.println("math의 랜덤");
		// 0.0 ~ 1.0 사이의 난수
		System.out.println(Math.random());
		System.out.println(Math.random() * 100);
		System.out.println((int)(Math.random() * 100));
		
		String[] prize = { "1등", "2등", "3등", "다음 기회에" };
		System.out.println(prize[r.nextInt(4)]);	// 0 ~ 3
	}
}
