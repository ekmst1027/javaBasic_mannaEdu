package ch03_operator;

public class Compare {
	public static void main(String[] args) {
		int a = 65;
		char c = 'A'; // ���� 65�� �����
		// A == B : A�� B�� ����
		
		// �ڵ�����ȯ : ���� �ڷ����� ū �ڷ������� ��ȯ
		
		// char(2) int (4)
		System.out.println(a == c);
		
		// A = B : B�� ���� A�� ���� 
		System.out.println(a = c);
		
		// compile error(������ ����)
		// warning(���)
		// A != B : ���� �ʴ�
		System.out.println('A' != 65);
	}
}
