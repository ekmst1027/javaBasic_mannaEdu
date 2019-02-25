package ch05_array;

public class StringArray {
	public static void main(String[] args) {
		String[] str = {"Java", "JSP", "Android", "HTML5"};
		
//		for(int i = 0; i < str.length; i++) {
//			System.out.println(str[i]);
//		}
		
		// 순서는 알 수 없음
		for (String s : str) {
			System.out.println(s);
		}
		
	}
}
