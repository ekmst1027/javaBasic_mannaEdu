package ch10;

// method 재정의(오버라이드, override)
// final method
// 오버라이드(method 재정의)를 할 수 없음
class Test{
	private int num = 10;
	public void print() {
		System.out.println("Test의 method : " + num);
	}
}

public class FinalMethod extends Test{
	int num = 20;
	
	@Override	// 어노테이션(annotation)
	public void print() {
		
	}
//	public void print() {
//		System.out.println("자식클래스 : " + num);
//	}
	
	public static void main(String[] args) {
		FinalMethod f = new FinalMethod();
		f.print();
	}

}

// 오버로딩 - 같은 클래스, 이름이 같은 method, 매개변수가 다름
// 오버라이딩 - 상속관계, method header 동일, 내용만 재정의
// @ at