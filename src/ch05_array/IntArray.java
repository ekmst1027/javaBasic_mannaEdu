package ch05_array;

public class IntArray {
	public static void main(String[] args) {
		int[] num;	// 배열참조변수 선언
		// new 자료형 => 동적 메모리 할당
		// 배열의 시작번지값을 num에 전달
		num = new int[5];	// 배열이 생성되고 참조변수에 연결
		
		// 배열참조변수[인덱스]
		num[0] = 10;	// 참조변수가 기리키는 첫번째 요소
		num[1] = 20;
		num[2] = 30;
		num[3] = 40;
		num[4] = 50;
		
//		int[] num = {10, 20, 30, 40, 50};
		
		
//		for(int i = 0; i < num.length; i++) {
//			System.out.println(num[i]);
//		}
		// 확장 for문(향상된 for문), for each문
		// for(개별값 : 집합)
		for(int n : num) {
			System.out.println(n);
		}
	}
}
