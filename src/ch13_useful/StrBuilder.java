package ch13_useful;

// String : 불변(immutable)
// StringBuffer, StringBuilder : 가변(mutable)
public class StrBuilder {
	public static void main(String[] args) {
		StringBuilder str1 = new StringBuilder();
//		StringBuffer str2 = new StringBuffer();
//		str2.append("Java");
		str1.append("Java");	// 원본 크기가 늘어남
		System.out.println(str1);	// toString()이 자동 호출됨
		System.out.println(str1.toString());
		
		str1.append(" Program");
		System.out.println(str1);
		// replace(start, end-1, "바꿀문자열")
		str1.replace(0, 4, "JSP");	// 원본이 변경됨
		System.out.println(str1);
		String str2 = str1.substring(3);
		System.out.println(str1);
		System.out.println(str2);
	}
}
