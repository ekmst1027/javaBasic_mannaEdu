package ch02;

public class Ex06_int {
	public static void main(String[] args) {
		// ������ ������ ���� ����
		int num1 = 100;
		System.out.println(num1);
		System.out.println(Integer.MIN_VALUE); // �ִ�
		System.out.println(Integer.MAX_VALUE); // �ּڰ�
		System.out.println(Integer.SIZE); // ��Ʈ��
		
		// int 4����Ʈ(32bit), long 8����Ʈ(64bit)
		// long �ڷ����� ���� + L
		// overflow(�����÷ο�)
		long num2 = 2147483648L;
		System.out.println(num2);
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.SIZE);
		
		// 1����Ʈ(8bit)
		byte num3 = 127;
		System.out.println(num3);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.SIZE);
		
	}
}
