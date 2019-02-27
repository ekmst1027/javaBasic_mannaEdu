package ch11_abstract;

// abstract class : 추상클래스(미완성 클래스) - 1개 이상의 추상메소드를 가진 클래스
// abstract method : 추상method(미완성 method), 메소드 내용이 완성되지 않은 메소드
// 추상클래스는 객체 생성을 할 수 없음.
// (하위클래스에서 상속받아 추상메소드를 오버라이딩해야 사용 가능)
abstract public class AbstractClass {
	// 추상(abstract) method
	abstract void method1();	// 메소드 body가 없고 세미콜론으로 끝남	
	void method2() {
		System.out.println("완성된 method");
	}
	

}
