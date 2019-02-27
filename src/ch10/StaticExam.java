package ch10;

// static의 활용 예
public class StaticExam {
	public static void main(String[] args) {
		int a = 40, b = 30, result;
		result = Math.max(a, b);	// 큰값 리턴
		System.out.println(result);	
		
		result = Math.min(a, b);	// 작은값 리턴
		System.out.println(result);
		
		double r = 15.3;
		System.out.println(2 * Math.PI * r);
		System.out.println(Math.PI * r * r);
	}
}
