package ch03_operator;

public class Shift {
	public static void main(String[] args) {
		int a = 2;
		// a�� ���� �������� 2��Ʈ�� ����Ʈ(�о��)
		int b = a << 2; // 00000010 => 00001000 (2 => 8)
		System.out.println(b);
		b = b >> 2;  //  00001000 => 00000010 (8 => 2)
		System.out.println(b);
	}
}
