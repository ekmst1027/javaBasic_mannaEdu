package ch13_useful;

public class WrapDouble {
	public static void main(String[] args) {
		// 객체참조변수 - 주소값(address, reference)을 저장하는 변수
		Double num1 = 11.5;	// 오토박싱(auto boxing)
		// Double num1 = new Double("11.5");
		double num2 = 3.5;
		double num3 = num1 / num2;
		System.out.println(num3);
		
		// double의 최댓값
		System.out.println(Double.MAX_VALUE);
		// double의 최솟값
		System.out.println(Double.MIN_VALUE);
		String str = "11.5";
		// 문자열+숫자 => 숫자가 문자열로 바뀐 후 연결됨
		System.out.println(str + 200);
		// Double.parseDouble(문자열) 실수값으로 변환
		System.out.println(Double.parseDouble(str) + 200);
		
	}
}
