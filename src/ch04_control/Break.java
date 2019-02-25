package ch04_control;

public class Break {
	public static void main(String[] args) {
		int i = 1;
		while(true) {	// 무한반복
			System.out.println(i++);
			if(i > 10) break;	// 반복문을 벗어남(탈출문)
		}
	}
}
