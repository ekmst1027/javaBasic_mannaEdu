package ch13_useful;

public class StringEx3 {
	public static void main(String[] args) {
		String a = "100";
//		String a = null;
		String b = "200";
		System.out.println(a+b);	// 문자열 연결
//		Integer.parseInt(문자열) : 문자열을 숫자로 변환
		// NullPointerException
		System.out.println(Integer.parseInt(a) + Integer.parseInt(b));
		System.out.println(Integer.valueOf(a) + Integer.valueOf(b));
	}
}
