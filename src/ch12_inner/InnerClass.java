package ch12_inner;

// static : 정적 멤버, 프로그램 시작 ~ 끝까지 변하지 않음
// dynamic
// InnerClass.class
// InnerClass$Inner.class
// 내부클래스(inner class), 중첩 클래스(nested class) : 클래스 내부에 있는 클래스
public class InnerClass {	// 외부 클래스(outer class)
	static int x = 10;
	class Inner {	// 내부 클래스(inner class) - 외부클래스의 멤버를 자유롭게 접근함
		int getX() {
			return x;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(x);
		// 외부클래스의 인스턴스 생성
		InnerClass e = new InnerClass();
		// 내부클래스의 인스턴스 생성
		InnerClass.Inner in = e.new Inner();	// 외부클래스.내부클래스
		System.out.println(in.getX());
	}
}
