package ch05_array;

import java.util.Scanner;

public class InputSum {
	public static void main(String[] args) {
		int[] num = new int[5];	// 정수 5개 배열 생성
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < num.length; i++) {
			System.out.print((i+1)+"번째 숫자를 입력하세요 : ");
			num[i] = sc.nextInt();	// 키보드로 정수 입력
			sum += num[i];
		}
		System.out.println("합계 : " + sum);
	}
}
