package ch02;

public class Ex04_char {
	public static void main(String[] args) {
		// ������ ���� ����
		// null ����
		char ch = '\0'; // ���� ����ǥ�� ���� 
		System.out.println(ch);
		// cast ������ (�ڷ��� ��ȯ)
		// ���ڰ��� ���ڰ����� ��ȯ
		System.out.println((int)ch);
		System.out.println(65);
		System.out.println((char)65);
		
		// �ݺ���
		// for(�ʱ��; ���ǽ�; �������ҽ�)
//		for(int i = 0; i < 255; i++) {
//			System.out.println(i + "==>" + (char)i);
//		}
//		for(int i = '��'; i <= '��'; i++) {
//			System.out.println(i + "==>" + (char)i);
//		}
		
		String str = ""; // �� ���ڿ��� ����Ŵ
		System.out.println(str);
		str = null; // ����Ű�� ������ ����
		str = " "; // ���� ���ڸ� ����Ŵ
	}
}
