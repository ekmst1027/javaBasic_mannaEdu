package ch13_useful;

public class ToStr {
	public static void main(String[] args) {
		// Object : 모든 자료형 처리 가능
		Object obj = new Object();
//		obj = 20;
		obj = new Integer(20);
		System.out.println(obj);
//		obj = 20.5;
		obj = new Double(20.5);
		System.out.println(obj);
//		obj = "hello";
		obj = new String("hello");
		System.out.println(obj);
	}
}
