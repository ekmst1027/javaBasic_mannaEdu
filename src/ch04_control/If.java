package ch04_control;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
//		int a = 5;
		Scanner scan = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ��� : ");	// �ȳ���
		int a = scan.nextInt();	// ���� �Է�
		
		// if(���ǽ�)
		if(a % 2 == 0) {	// true�� �� 
			System.out.println(a + " ==> ¦���Դϴ�.");
		} else {	// false�� ��
			System.out.println(a + " ==> Ȧ���Դϴ�.");
		}
		
	}
}
