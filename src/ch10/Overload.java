package ch10;

// 오버로드(overload)
// 같은 클래스에서 method 이름이 중복
public class Overload {
	public void putData(String a) {
		System.out.println(a);
	}
	
	public void putData(int a) {
		System.out.println(a);
	}
	
	public void putData(double a) {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		// 클래스의 변수, method를 사용하려면
		// 먼저 객체(인스턴스)를 만든 후
		// 객체참조변수를 통해 호출해야 함
		Overload obj = new Overload();
		obj.putData("hello");
		obj.putData(100);
		obj.putData(100.5);
	}
}
