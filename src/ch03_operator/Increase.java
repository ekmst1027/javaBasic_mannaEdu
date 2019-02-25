package ch03_operator;

public class Increase {
	public static void main(String[] args) {
		int i = 5;
		int j = 0;
		// ++ 1 증가, -- 1 감소
		// ++i 먼저 증가
		// i++ 나중에 증가 
		j = i++;	// 먼저 대입한 후 i값 증가
		// 문자열 + 문자열 => 연결
		// 숫자 + 문자열 => 문자열로 연결됨 
		System.out.println(i + "," + j);
		i = 5;
		j = ++i;	// i가 먼저 증가, 대입
		System.out.println(i + "," + j);
	}
}
