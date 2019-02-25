package ch04_control;

public class Args {
	public static void main(String[] args) {
		// 배열참조변수.length => 배열의 요소 갯수
		// 배열참조변수[인덱스] => 0부터
		for(int i = 0; i < args.length; i++) {
			System.out.println(i + "번째 매개변수 : " + args[i]);
		}
	}
}
