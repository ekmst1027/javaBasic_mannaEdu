package ch13_useful;

import java.util.Arrays;

// 정렬(sort)
// 버블정렬, 선택정렬, 퀵정렬 등등
// 버블정렬(bubble) 예시
// 50, 40, 70, 90, 120, -20
// -20, 50, 70, 90, 120, 40
// -20, 40, 70, 90, 120, 50
// -20, 40, 50, 90, 120, 70
// -20, 40, 50, 70, 120, 90
// -20, 40, 50, 70, 90, 120

public class ArrSort {
	public static void main(String[] args) {
		int[] num = { 50, 40, 70, 90, 120, -20 };
		System.out.println("정렬하기 전");
		
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i] + "\t");
		}
		
		int temp = 0;	// 임시변수
		for(int i = 0; i < num.length; i++) {
			for(int j = i+1; j < num.length; j++) {
				// 값을 비교하여 자리를 바꿈
//				if(num[i] > num[j]) {	// 오름차순	
				if(num[i] < num[j]) {	// 내림차순
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		
		System.out.println("\n정렬한 후");
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i] + "\t");
		}
		
		// Arrays.sort(배열이름);
		Arrays.sort(num); // 오름차순으로 정렬
		
		System.out.println("\n메소드를 이용하여 오름차순 정렬한 후");
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i] + "\t");
		}
		
	}
}
