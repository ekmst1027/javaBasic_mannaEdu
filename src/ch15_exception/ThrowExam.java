package ch15_exception;

// throw : 예외를 직접 발생시키는 방법
public class ThrowExam {
	static void test(int n) {
		// throw new 예외처리클래스(); : 특정한 조건에 인위적으로 예외를 발생시킴
		if(n == 0) {
			throw new NullPointerException();
		}
	}
	public static void main(String[] args) {
		test(0);
	}

}
