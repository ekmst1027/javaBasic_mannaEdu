package ch13_useful;

import java.util.Calendar;
import java.util.Date;


public class Cal {
	public static void main(String[] args) {
//		Calendar cal = new Calendar();	// 추상 클래스이기 때문에 이렇게 사용불가
		Calendar cal = Calendar.getInstance();
		
		System.out.println(cal.get(Calendar.YEAR));
		// 월 0 ~ 11
		System.out.println(cal.get(Calendar.MONTH) + 1);	// 현재월을 알려면 + 1을 해야 함
		System.out.println(cal.get(Calendar.DATE));	// 날짜
		System.out.println(cal.get(Calendar.HOUR));	// 12시간제
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));	// 24시간제
		System.out.println(cal.get(Calendar.MINUTE));	// 분
		System.out.println(cal.get(Calendar.SECOND));	// 초
		System.out.println(cal.get(Calendar.AM_PM));	// 오전(0), 오후(1)
		if(cal.get(Calendar.AM_PM) == 0) {
			System.out.println("오전");
		} else {
			System.out.println("오후");
		}
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));	// 1년 중 몇번째 날
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));	// 월의 몇번째 날
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));	// 요일코드(일요일 1 ~ 토요일 7)
		String yoil = "";
		switch(cal.get(Calendar.DAY_OF_WEEK)) {
		case 1: yoil = "일요일"; break;
		case 2: yoil = "월요일"; break;
		case 3: yoil = "화요일"; break;
		case 4: yoil = "수요일"; break;
		case 5: yoil = "목요일"; break;
		case 6: yoil = "금요일"; break;
		case 7: yoil = "토요일"; break;
		}
		System.out.println("오늘은 " + yoil + "입니다.");
		
		// 몇 번째 주
		System.out.println(cal.get(Calendar.WEEK_OF_YEAR));	
		
		// java.util.Date
		Date date = cal.getTime();
		// deprecated method(권장하지 않는 method)
		System.out.println(date.getYear() + 1900);
		System.out.println(date.getMonth() + 1);
		System.out.println(date.getDate());
		
	}
}
