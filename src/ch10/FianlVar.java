package ch10;

// 변수(variable)
// 상수(constant)
// 명명규칙(Naming Rule) - final 변수는 대문자, 2단어 이상일 경우 _를 붙임
public class FianlVar {
	public static void main(String[] args) {
		final int MAX_NUM = 100;	// 값을 수정할 수 없음(상수)
		System.out.println(MAX_NUM);
//		max = 200;
//		System.out.println(max);
	}
}
