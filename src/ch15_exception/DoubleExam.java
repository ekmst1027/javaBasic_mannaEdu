package ch15_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

// 2개 이상 예외가 발생하는 경우
public class DoubleExam {
	public static void main(String[] args) {
		int num = 50;
		Scanner scan = new Scanner(System.in);
		try {
			System.out.print("숫자를 입력하세요 : ");
			int value = scan.nextInt();
			System.out.println(num / value);
		} catch (ArithmeticException e) {	// 산술연산 관련 예외
			System.out.println("0으로 나눌 수 없습니다.");
		} catch(InputMismatchException e) {	// 입력형식 오류
			System.out.println("숫자만 입력 가능합니다.");
		} catch(Exception e) {
			System.out.println("기타 예외 발생");
		}
		System.out.println("프로그램 종료");
	}
}
