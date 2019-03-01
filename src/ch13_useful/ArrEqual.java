package ch13_useful;

import java.util.Arrays;

public class ArrEqual {
	public static void main(String[] args) {
		int[] num1 = {10, 20, 30, 40, 50};
		int[] num2 = {10, 20, 30, 40, 50};
		
		// Arrays.equals(배열1, 배열2)
		// 배열의 내용이 같으면 true, 다르면 false
		if(Arrays.equals(num1, num2)) {
			System.out.println("배열의 내용이 같습니다.");
		} else {
			System.out.println("배열의 내용이 틀립니다.");
		}
	}
}
