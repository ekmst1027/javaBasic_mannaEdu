package ch04_control;

public class For {
	public static void main(String[] args) {
		// args ��Ʈ�� �迭��������
		// Integer.parseInt(���ڿ�) => ���ڷ� ��ȯ
		// "100" => 100
		// �迭��������.length => �迭�� ũ��
		if(args.length == 0) {
			System.out.println("����� �Ű������� �Է��ϼ���.");
			System.exit(0);	// ���α׷� ���� ����
		}
		
		int num = Integer.parseInt(args[0]);
		// for(�ʱ��; ���ǽ�; ������)
		// ���ǽ��� true�ϵ��� �ݺ� ó��
		// ���ѷ��� ����
		for(int i = 1; i <= num; i++) {
			System.out.println(i);
		}
	}
}
