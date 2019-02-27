package ch11_abstract;

// class 클래스 implements 인터페이스
public class Airplane implements flyer {

	@Override
	public void takeOff() {
		System.out.println("Airplane 이륙");
	}

	@Override
	public void fly() {
		System.out.println("Airplane 비행");
	}

	@Override
	public void land() {
		System.out.println("Airplane 착륙");
	}

}
