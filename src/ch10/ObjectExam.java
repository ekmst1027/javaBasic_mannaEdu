package ch10;

// 값(value)을 저장하는 변수 : 기본자료형 - boolean, byte, char, short, int, long, float, double
// 주소값(address)을 저장하는 변수(참조변수)
public class ObjectExam {
	public static void main(String[] args) {
		ObjectExam ex = new ObjectExam();
		System.out.println(ex.getClass());
		
		Object a = 10;
//		Object a = new Integer(10);
		
		System.out.println(a);
		a = 100.5;
		System.out.println(a);
		a = true;
		System.out.println(a);
		a = "Hello";
		System.out.println(a);
		
		
	}
}
