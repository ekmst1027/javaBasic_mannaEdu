package ch10;

class Test1 {
	int a = 10;
	public void print() {
		System.out.println("Test1 클래스 : " + a);
	}
}

class Test2 extends Test1 {
	int a = 20;
	// method 재정의(오버라이드)
	@Override
	public void print() {
		System.out.println("Test2 클래스 : " + a);
	}
}

public class OverrideExam {
	public static void main(String[] args) {
		Test2 t = new Test2();
		t.print();
	}
}
