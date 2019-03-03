package ch15_exception;

public class TryExam {
	public static void main(String[] args) {
		int[] num = {10, 20, 30, 40, 50};
		try {
			for(int i = 0; i <= 5; i++) {
				System.out.println(num[i]);
			}
			
		} catch (Exception e) {
			System.out.println("배열의 범위가 초과되었습니다.");
		} finally {	// 항상 실행
			System.out.println("finally");
		}
		System.out.println("프로그램이 종료되었습니다.");
	}
}
