package ch02;

import java.util.Scanner;

// ù���� �빮�� => Ŭ����
public class Ex03_input {
	public static void main(String[] args) {
		// System.in : ǥ�� �Է���ġ(Ű����)
		Scanner scan = new Scanner(System.in);
		
		// print() : ��¸�
		// println() : ��� �� �ٹٲ�
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		// ����ڰ� �Է��� ������ ������ ����
		String name = scan.nextLine();
		System.out.println("����� �̸��� " + name + "�Դϴ�.");
		
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = scan.nextInt();	// ���� �Է�
		System.out.println("����� ���̴� " + age + "�Դϴ�.");
	}
}
