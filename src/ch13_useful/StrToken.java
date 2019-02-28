package ch13_useful;

import java.util.StringTokenizer;

// StringTokenizer : 스트링 구분자
// token : 연속된 문자에서 구별할 수 있는 단위
public class StrToken {
	public static void main(String[] args) {
		String str = "apple/banana/grape/melon";
		// csv파일(comma seperated values)
		// 문자열.split("구분자") 하나의 문자열을 배열로 변환
		// items[0] = "apple" items[1] = "banana" ...
		String[] items = str.split("/");
		// for(개별변수 : 배열)
		for(String s : items) {
			System.out.println(s);
		}
		
		// new StringTokenizer("문자열", "구분자");
		StringTokenizer st = new StringTokenizer(str, "/");
		int cnt = st.countTokens();
		System.out.println("토큰의 갯수 : " + cnt);
		while(st.hasMoreElements()) {	// 다음 요소가 있으면
			System.out.println(st.nextToken());	// 다음 요소로 이동
		}
		
	}
}
