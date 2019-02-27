package ch12_inner;

public class InnerFinal {
	private int x = 10;
	void print() {
		int y = 20;	// 지역변수(local variable)
		class Inner {	// method 내부에 선언된 내부 클래스
			void test() {
				// 내부클래스에서는 외부클래스의 모든 멤버에 접근 가능
				System.out.println(x);
				System.out.println(y);
			}
		}
	}
}
