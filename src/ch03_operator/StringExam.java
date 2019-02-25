package ch03_operator;

public class StringExam {
	public static void main(String[] args) {
		
		// 문자열 + 문자열 => 문자열 연결
		String str = "Hello " + "java";
		System.out.println(str);
		
		// 숫자 + 문자열 => 문자열로 변환 후 연결
		str = 123 + "C";
		System.out.println(str);
	}
}
