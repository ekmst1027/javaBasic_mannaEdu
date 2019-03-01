package ch13_useful;

import java.util.GregorianCalendar;
import java.util.Scanner;

// 윤년 계산
// 4의 배수이고 100의 배수가 아닌 해 또는 400의 배수인 해
public class LeapYear {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("연도를 입력하세요 : ");
		int year = scan.nextInt();
		
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println("윤년입니다.");
		} else {
			System.out.println("평년입니다.");
		}
		
		GregorianCalendar cal = new GregorianCalendar();
		// 캘린더객체.isLeapYear(연도) ==> 윤년이면 true, 평년이면 false
		if(cal.isLeapYear(year)) {
			System.out.println("윤년입니다.");
		} else {
			System.out.println("평년입니다.");
		}
	}
	
}
