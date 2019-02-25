package ch05_array;

public class CharArray {
	public static void main(String[] args) {
		char[] ch = {'J', 'a', 'v', 'a'};
		
//		for(int i = 0; i < ch.length; i++) {
//			System.out.println(i+"번째 문자 : " + ch[i]);
//			System.out.println(Character.toUpperCase(ch[i]));	// 대문자로 변환
//			System.out.println(Character.toLowerCase(ch[i]));	// 소문자로 변환
//		}
		
		for (char c : ch) {
			System.out.println(c);
		}
		
	}
}
