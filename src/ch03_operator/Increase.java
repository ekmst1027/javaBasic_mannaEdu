package ch03_operator;

public class Increase {
	public static void main(String[] args) {
		int i = 5;
		int j = 0;
		// ++ 1 ����, -- 1 ����
		// ++i ���� ����
		// i++ ���߿� ���� 
		j = i++;	// ���� ������ �� i�� ����
		// ���ڿ� + ���ڿ� => ����
		// ���� + ���ڿ� => ���ڿ��� �����
		System.out.println(i + "," + j);
		i = 5;
		j = ++i;	// i�� ���� ����, ����
		System.out.println(i + "," + j);
	}
}
