package ch04_control;

public class While {
	public static void main(String[] args) {
		// 1~10까지 출력
		int i = 1;	// 초기식
		while(i <= 10) {	// 조건식이 true일 동안
			System.out.println(i);
			i++;	// 증감식(무한루프)
		}
	}
}
