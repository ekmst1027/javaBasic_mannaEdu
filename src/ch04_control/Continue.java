package ch04_control;

public class Continue {
	public static void main(String[] args) {
		for(int i = 1; i < 10; i++) {
			// 5�� ����� ������� ����
			if(i % 3 == 0) {
				System.out.println();
				continue;
			}
			System.out.println(i);
		}
	}
}
