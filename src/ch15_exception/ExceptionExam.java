package ch15_exception;

public class ExceptionExam {
	public static void main(String[] args) {
		int a = 10, b = 0, c;
		try {	// 예외가 발생할 가능성이 있는 코드
			c = a / b;
			System.out.println(c);
		} catch(Exception e) {
			// 예외가 발생했을 때의 코드
			System.out.println("0으로 나눌 수 없습니다.");
		}
		System.out.println("프로그램이 종료되었습니다.");
	}

}
