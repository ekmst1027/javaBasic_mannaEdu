package ch04_control;

import java.util.Scanner;

// ��۷� ���(���űݾ��� 2���� �̻��̸� ��۷� ����, �ƴϸ� 2000��,
// ����Ʈ ���� �ݾ��� 1���� �̻��̸� ����Ʈ ��� ����
public class Cost {
	public static void main(String[] args) {
		// ���� ����
		String name = ""; // �̸�
		int price = 0;	// ���űݾ�
		int point = 0;	// ����Ʈ
		int point_use = 0;	// ����Ʈ ����
		int fee = 0;	// ��۷�
		int pay;	// ���� �����ݾ�
		// �ڷ� �Է�(����)
		Scanner scan = new Scanner(System.in);
		System.out.print("�̸��� �Է��ϼ��� : ");
		name = scan.nextLine();
		System.out.print("������ �Է��ϼ��� : ");
		price = scan.nextInt();
		System.out.print("����Ʈ�� �Է��ϼ��� : ");
		point = scan.nextInt();
		
		// ���űݾ��� 2���� �̸��̸� ��۷� 2õ��
		if(price < 20000) {
			fee = 2000;
		}
		
		// ����Ʈ �������� 1���� �̻��̸� ����Ʈ ��� ����
		if(point >= 10000) {
			point_use = point;
			pay = price + fee - point;
		} else {
			pay = price + fee;
		}
		System.out.println("�̸�\t���űݾ�\t��۷�\t����Ʈ���\t\t�����ݾ�");
		// String.format("�������", ����Ұ�)
		// %d : ������ => %,d : õ���� �޸� �߰�
		System.out.println(name + "\t" + price + "\t" + fee + "\t" + point_use + "\t\t" + String.format("%,d", pay));
	}

}
