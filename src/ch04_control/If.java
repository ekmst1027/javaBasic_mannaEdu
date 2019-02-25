package ch04_control;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
//		int a = 5;
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");	// 안내문
		int a = scan.nextInt();	// 정수 입력
		
		// if(조건식)
		if(a % 2 == 0) {	// true일 때 
			System.out.println(a + " ==> 짝수입니다.");
		} else {	// false일 때
			System.out.println(a + " ==> 홀수입니다.");
		}
		
	}
}
