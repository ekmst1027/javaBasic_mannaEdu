package ch13_useful;

public class AutoBox {
	public static void main(String[] args) {
		int num1 = 10;
		int num2;
		Integer i1;
		
//		Integer i2 = new Integer(20);

		// 오토박싱(Auto Boxing) : 객체 안에 value 변수 포함
		Integer i2 = 20;
		i1 = num1;
		
		
		// 오토언박싱(Auto Unboxing) : 객체 안에 포함된 변수를 꺼냄
		num2 = i2;
		
		System.out.println(num1 + "\t" + i1);
		System.out.println(num2 + "\t" + i2);
	}
}

// 래퍼클래서(Wrapper class) : 기본자료형의 다양한 연산을 지원하는 클래스