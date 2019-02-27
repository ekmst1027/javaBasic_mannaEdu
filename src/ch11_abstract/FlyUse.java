package ch11_abstract;

public class FlyUse {
	public static void main(String[] args) {
		// Bird 클래스 객체 생성
		Bird bird = new Bird();
		bird.takeOff();
		bird.fly();
		bird.land();
		
		// 인터페이스는 인스턴스(객체)를 만들 수 없음
//		Flyer f = new Flyer();
		Airplane air = new Airplane();
		air.takeOff();
		air.fly();
		air.land();
		
		// 좌변 부모, 우변 자식(다형성)
		// 하나의 부모 자료형으로 자양한 자식 클래스의 method를 호출
		// 좌변 자식, 우변 부모 => 에러
		
		flyer f = new Bird();
		f.takeOff();
		f.fly();
		f.land();
		
		f = new Airplane();
		f.takeOff();
		f.fly();
		f.land();
		
	}
	
}
