package ch04_control;

public class LeapYear {
	public static void main(String[] args) {
		for(int year = 2000; year <= 2020; year++) {
			if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
				System.out.println(year + "년 ==> 윤년");
			} else {
				System.out.println(year + "년 ==> 평년");
			}
		}
	}
}
