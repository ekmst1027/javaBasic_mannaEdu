package ch13_useful;

public class ReplaceEx {
	public static void main(String[] args) {
		String a = "java program";
		System.out.println(a);
		// 문자열.replace(A, B) : A를 B로 변경
		System.out.println(a.replace("java", "자바"));
		System.out.println(a);
		a = a.replace("java", "자바");
		System.out.println(a);
	}
}
