package ch13_useful;

public class StringExam {
	public static void main(String[] args) {
		// String str = new String("hello");
		String str = "hello";
		String str2 = "hello";
		// A = B 대입, A == B 비교
		System.out.println(str==str2);
		String str3 = new String("hello");
		String str4 = new String("hello");
		System.out.println(str3 == str4);	// 주소값 비교
		// A.equals(B) A와 B의 내용이 같다
		System.out.println(str3.equals(str4));	// 내용 비교
		System.out.println(str4.equals(str3));
	}

}
