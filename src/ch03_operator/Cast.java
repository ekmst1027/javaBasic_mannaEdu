package ch03_operator;

public class Cast {
	public static void main(String[] args) {
		// float 4����Ʈ, double 8����Ʈ
		// �Ǽ��� => 8����Ʈ�� ����
		// �Ǽ���F(f) => 4����Ʈ�� ���� 
		
		float f = 1.6F;	// 4����Ʈ�� ����
		System.out.println(f);
		
		f = 100; // �ڵ�����ȯ(���� �ڷ��� => ū �ڷ���)
		System.out.println(f);
		
		// ��������ȯ(����� ����ȯ)
		// (�ڷ���) => cast ������
		f = 100.5f; 
		int i = (int)f;
		System.out.println(i);
		
		i = 300;
		// -128 ~ 127
		// ū �ڷ����� ���� �ڷ������� �ٲ� ��� 
		// ���е��� �������ų� ���� �սǵ� �� ����
		byte b = (byte)i;	
		System.out.println(b);
	}
}
