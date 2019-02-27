package ch11_abstract;

// 추상클래스는 인스턴스를 만들 수 없음
// Add unimplemented methods : 추상 method를 완성
public class AbstractExtends extends AbstractClass {

	@Override
	void method1() {
		System.out.println("추상 method를 완성한 method");
	}
	
	public static void main(String[] args) {
		AbstractExtends ex = new AbstractExtends();
		ex.method1();
		ex.method2();
	}

}
