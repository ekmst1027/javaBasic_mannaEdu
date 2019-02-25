package ch06_method;

public class Return {
	// 매개변수(parameter, argument)
	// 리턴타입(return type)
	static int sum(int a) {
		int result = 0;
		for(int i = 1; i <= a; i++) {
			result = result + i;
		}
		return result; // method를 호출한 곳으로 리턴값을 돌려줌 
	}
	
	public static void main(String[] args) {
		System.out.println("프로그램 시작...");
//		int n = sum(50);	// method 호출
//		System.out.println(n);
//		System.out.println(sum(100));
		for(int i = 10; i <= 20; i++) {
			System.out.println(sum(i));
		}
		System.out.println("프로그램 끝");
	}

}
