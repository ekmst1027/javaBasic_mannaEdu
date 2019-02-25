package ch04_control;

public class Continue {
	public static void main(String[] args) {
		for(int i = 1; i < 10; i++) {
			// 5의 배수는 출력하지 않음
			if(i % 3 == 0) {
				System.out.println();
				continue;
			}
			System.out.println(i);
		}
	}
}
