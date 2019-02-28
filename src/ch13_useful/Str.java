package ch13_useful;

public class Str {
	public static void main(String[] args) {
		String str = "Java Programming";
		System.out.println(str);
		// 스트링은 원본이 바뀌지 않음(복사본을 만들고 작업함)
		System.out.println(str.toUpperCase());	// 대문자로
		System.out.println(str.toLowerCase());	// 소문자로
		System.out.println(str);
		// 참조변수가 가리키는 문자열이 변경됨
		str = str.toLowerCase();
		System.out.println(str);
		
		str = "";
		System.out.println("내용 : " + str);
		System.out.println("글자수 : " + str.length());
		str = null;
		System.out.println("내용 : " + str);
		// NullPointerException
		// 객체참조변수가 null을 가리킬 때 발생
//		System.out.println("글자수 : " + str.length());
		
		char ch = '\0';	// 널문자(null character)
		System.out.println("내용 : " + ch + ", code : " + (int)ch);
		ch = ' '; //공백문자
		System.out.println("내용 : " + ch + ", code : " + (int)ch);
		// 아스키코드(ascii) - 영어권 문자, 256자, 1바이트
		// 유니코드(unicode) - 비영어권 문자, 65535자, 2바이트
	}
}
