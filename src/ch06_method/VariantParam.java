package ch06_method;

public class VariantParam {
	// 자료형 ... => 가변사이즈 매개변수 선언
	// method를 호출할 때 매개변수의 자료형이 같은 경우
	// 배열로 묶어서 받음
	static void print(Object ... n) {
		for(int i = 0; i < n.length; i++) {
			System.out.println(n[i]);
		}
	}
	
	static void sum(int ... n) {
		int result = 0;
		for(int i = 0; i < n.length; i++) {
			result += n[i];
		}
		System.out.println(result);
	}
	
//	static void print(String a) {
//		System.out.println(a);
//	}

	public static void main(String[] args) {
		print("java");	// 1개
		print("java", "test");	// 2개
		print("java", "test", "ok");	// 3개
		print("java", 123, 234, 453);
		
		sum(10, 20, 30, 40, 50);
		
		// F3 소스코드 보기
		System.out.println(10);
		System.out.println("Hello");
		System.out.println(true);
		System.out.println(30.2);
	}
	
}
