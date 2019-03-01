package ch13_useful;

// 배열의 내용을 비교
// 배열 : 동일한 자료형, 사이즈가 고정
// 자료형[] 배열참조변수;
// 배열참조변수 = new 자료형[사이즈];
public class Arr {
	public static void main(String[] args) {
		int[] num1 = { 10, 20, 30, 40, 50 };
		int[] num2 = { 10, 20, 30, 40, 50 };
		boolean b = true;
		// 배열참조변수.length : 배열의 데이터 갯수
		if(num1.length != num2.length) {	// 갯수가 다르면
			b = false;
		} else {	// 갯수가 같으면
			for(int i = 0; i < num1.length; i++) {
				if(num1[i] != num2[i]) {	// 두 개의 숫자가 다르면
					b = false;
					break;	// for문을 벗어남
				}
			}
		}
		if(b == true) {
			System.out.println("배열의 내용이 같습니다.");
		} else {
			System.out.println("배열의 내용이 틀립니다.");
		}
	}
}
