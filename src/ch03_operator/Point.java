package ch03_operator;

import java.util.Scanner;

// ����, ����, ���� ������ �Է¹޾� ����, ��� ���
public class Point {
	public static void main(String[] args) {
		// ���� ����
		String name;
		int kor, eng, mat, tot;
		double avg;
		
		// �Է� ��ü ����
		// Scanner : Ű���� �Է� ���� Ŭ����
		// System.in : ǥ���Է���ġ(Ű����)
		Scanner scan = new Scanner(System.in);
		System.out.print("�̸� : ");
		name = scan.nextLine();	// ��Ʈ��(����)
		System.out.print("���� ���� : ");
		kor = scan.nextInt();	// �� �Է�
		System.out.print("���� ���� : ");
		eng = scan.nextInt();	// ���� �Է�
		System.out.print("���� ���� : ");
		mat = scan.nextInt();	// ���� �Է�
		scan.close();	// ��ĳ�� ��ü�� ������� �޸� ����
		
		// ���
		tot = kor + eng + mat;	// ����
		avg = tot / 3.0;	// ���
		
		// ��� ���
		System.out.println("�̸�\t����\t����\t����\t����\t���");
		System.out.printf(
				"%s\t%d\t%d\t%d\t%d\t%5.1f",
				name, kor, eng, mat, tot, avg
				);
		// String.format("�������", ����Ұ���)
		// % ����� ��ġ
		// �����ڸ���.�Ҽ������ڸ���
		// f �Ǽ���, d ������, s ���ڿ�
	}
}
