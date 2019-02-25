package ch06_method;

public class CallBy {
	static void test(int a) {
		System.out.println("test method 호출");
		a = 20;
		System.out.println(a);
	}
	
	static void test2(int[] n) {
		n[0] = 100;
		for(int i = 0; i < n.length; i++) {
			System.out.println(n[i] + "\t");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("시작");
		int a = 10;
		// 값에 의한 호출(call by value)
		test(a);
		System.out.println(a);
		
		int[] num = {10, 20, 30, 40, 50};
		// 배열참조변수 <- 배열의 첫번째 요소의 주소값
		System.out.println(num[0]);
		// 주소값(참조)에 의한 호출(Call by reference)
		test2(num);
		
		System.out.println("끝");
		for(int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}

}
