package ch06_method;

import java.util.Scanner;

public class Holiday {
	static int y;	// 전역변수(클래스 전체에서 사용 가능)
	static void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("근속연수 : ");
		y = sc.nextInt();
	}
	
	static int holiday(int year) {
		int day = 0;	// 지역변수
		if(year <= 5) {
			day = 10;
		} else if(year <= 10) {
			day = 15;
		} else if(year <= 10) {
			day = 15;
		} else {
			day = 20;
		}
		return day;
	}
	
	public static void main(String[] args) {
		input();
		System.out.println("휴가일수 : " + holiday(y));
	}

}
