package ch03_operator;

public class BitNot {
	public static void main(String[] args) {
		// ~ ������(��Ʈ���� ������Ŵ, 0�� 1��, 1�� 0����)
		byte a = 10;
		System.out.println(a); // 00001010 => 11110101
		System.out.println(~a); // bit not
	}
}
