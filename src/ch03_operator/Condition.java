package ch03_operator;

public class Condition {
	public static void main(String[] args) {
		int num = -5;
//		���ǽ� ? ���϶��� �� : �����϶��� ��
//		System.out.println(num > 0 ? num : -num);
		System.out.println(num > 0 ? num : -num);	// ���밪�� ����ϴ� �ڵ�
		
		if(num > 0) {
			System.out.println(num);
		} else {
			System.out.println(-num);
		}
	}
}
