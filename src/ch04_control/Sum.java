package ch04_control;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
//		int num = 10;
		Scanner sc = new Scanner(System.in);
		System.out.print("���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		int sum = 0;
		for(int i = 1; i <= num; i++) {
			sum += i;
		}
		System.out.println("�հ� : " + sum);
	}
}
