package ch04_control;

// ��ø for��(����for��)
public class Star {
	public static void main(String[] args) {
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();	// �ٹٲ޸�
		}
		System.out.println();
		// ���ﰢ��
		for(int i = 5; i >= 1; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
