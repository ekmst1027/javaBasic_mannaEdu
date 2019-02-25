package ch06_method;

public class Recursive {
	// 재귀호출
	static long fact1(int n) {
		// 조건식 ? true일때의 값 : false일때의 값
		// 5 x fact1(4)
		//     4 x fact1(3)
		//          3 x fact1(2)
		//              2 x fact1(1)
		//                   1
		return n == 1 ? 1 : n * fact1(n-1);
	}
	
	static long fact2(int n) {
		long result = 1;
		for(int i = 1; i <= n; i++) {
			result = result * i;
		}
		return result;
	}
	
	public static void main(String[] args) {
		// 디버깅, 중단범(Break Point)
		// F5 step into(하위코드로)
		// F6 step over(현재코드만)
		System.out.println(fact1(5));
		System.out.println(fact1(5));
	}

}
