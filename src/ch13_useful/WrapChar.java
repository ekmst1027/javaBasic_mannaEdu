package ch13_useful;

public class WrapChar {
	public static void main(String[] args) {
		char[] data = {'J', 'a', 'v', 'a', '1', '#'};	// 문자배열
		for(int i = 0; i < data.length; i++) {	// 배열이름.length ==> 배열의 사이즈
//			data[i] = Character.toUpperCase(data[i]);	// 대문자로
//			data[i] = Character.toLowerCase(data[i]);	// 소문자로
			if(Character.isUpperCase(data[i])) {	// 대문자이면
				System.out.println(data[i] + " ==> 대문자");
			} else if(Character.isLowerCase(data[i])) {	// 소문자이면
				System.out.println(data[i] + " ==> 소문자");
			} else if(Character.isDigit(data[i])) {	// 숫자이면
				System.out.println(data[i] + " ==> 숫자");
			} else {	// 그 외의 경우
				System.out.println(data[i] + " ==> 기타문자");
			}
		}
	}
}
