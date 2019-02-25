package ch06_method;

public class Overload {
	// overload : 같은 클래스에서 이름이 같은 method 허용
	// 매개변수의 자료형과 갯수가 달라야 함
	
	// 파라미터를 Object로 하면 메소드 1개로 처리됨(그러나 속도 문제)
	static void print(int a) {
		System.out.println(a);
	}
	
	static void print(double a) {
		System.out.println(a);
	}
	
	static void print(String a) {
		System.out.println(a);
	}
	
	static void print(int a, double b) {
		System.out.println(a + ", " + b);
	}
	
//	// 오버로딩의 기준은 매개변수
//	static String print(String a) {
//		System.out.println(a);
//	}
//	// 매개변수명은 관계없음
//	static void print(String b) {
//		System.out.println(b);
//	}
	
	public static void main(String[] args) {
		print(10);
		print(100.5);
		print(10, 100.5);
		print("hello");
	}

}
