package ch13_useful;

public class StringEx4 {
	public static void main(String[] args) {
		// 스트링을 숫자로 Integer.parseInt(문자열)
		// 숫자를 스트링으로 변환
		String a = 100+"";
		System.out.println(a);
		a = String.valueOf(100);	// 숫자를 스트링으로 변환
		System.out.println(a);
		System.out.println(true);
		System.out.println(String.valueOf(true));
	}

}
