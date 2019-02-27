package ch11_abstract;

public class Point {
	int a, b;
	public Point() {	// 기본생성자(default constructor)
		this(0, 0);	// 매개변수가 있는 생성자 호출
	}
	
	public Point(int a, int b) {
		this.a = a;
		this.b = b;
	}
}
