package ch02;

import java.util.Scanner;

// 첫글자 대문자 => 클래스
public class Ex03_input {
	public static void main(String[] args) {
		// System.in : 표준 입력장치(키보드)
		Scanner scan = new Scanner(System.in);
		
		// print() : 출력만
		// println() : 출력 후 줄바꿈
		
		System.out.print("이름을 입력하세요 : ");
		// 사용자가 입력한 내용을 변수에 저장
		String name = scan.nextLine();
		System.out.println("당신의 이름은 " + name + "입니다.");
		
		System.out.print("나이를 입력하세요 : ");
		int age = scan.nextInt();	// 숫자 입력
		System.out.println("당신의 나이는 " + age + "입니다.");
	}
}
