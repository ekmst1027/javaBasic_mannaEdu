package ch13_useful;

public class StrMethod {
	public static void main(String[] args) {
		String str1 = "java";
		str1 += " Programming";	// 좌변 + 우변 문자열을 합침
		System.out.println(str1);
		System.out.println(str1.length());	// 글자수
		// A.concat(B) : A문자열과 B문자열을 연결
		String str2 = str1.concat(" programming");
		System.out.println(str2);
		
		// 문자열.charAt(인덱스) : 몇번째 글자
		System.out.println(str1.charAt(2));

		// 문자열.indexOf("찾는내용") : 처음 찾은 위치값
		// 찾는 내용이 없으면 -1 리턴
		str2 = "java program";
		System.out.println(str2.indexOf("r"));
		System.out.println(str2.indexOf("program"));
		System.out.println(str2.indexOf("오라클"));
		
		// 단순히 존재여부만 찾을때 사용, 위치는 중요하지 않음
		if(str2.indexOf("java") != -1) {
			System.out.println("찾는 내용이 있습니다.");
		} else {
			System.out.println("찾는 내용이 없습니다.");
		}
		
		str2 = "java program";
		// substring(start, end-1)
		System.out.println(str2.substring(0, 4));
		// substring(start) : start ~ 끝까지
		System.out.println(str2.substring(5));
		System.out.println(str2.replace("java", "jsp"));
		System.out.println(str2);
		str2 = str2.replace("java", "jsp");
		System.out.println(str2);
		
	}
}
