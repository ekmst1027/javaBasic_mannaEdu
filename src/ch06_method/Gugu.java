package ch06_method;

public class Gugu {
	static void gugu(int dan) {
		System.out.println("==" + dan + "단==");
		for(int i = 1; i <= 9; i++) {
			System.out.println(dan + "x" + i + "=" + dan*i);
		}
	}
	
	public static void main(String[] args) {
		// gugu(5)
		// gugu(3)
		for(int i = 2; i <= 9; i++) {
			gugu(i);
		}
	}

}
