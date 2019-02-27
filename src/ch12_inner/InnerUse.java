package ch12_inner;

// InnerUse.class
// InnerUse$1.class
// 익명내부클래스는 이름이 없으므로 외부클래스$번호.class로 컴파일 됨
public class InnerUse {
	public static void main(String[] args) {
		// 인터페이스는 인스턴스를 만들 수 없음
//		Flyer f = new Flyer();
		// 무명 클래스, 익명 클래스
		Flyer f = new Flyer() {

			@Override
			public void takeOff() {
				System.out.println("takeOff...");
			}

			@Override
			public void fly() {
				System.out.println("fly...");
			}

			@Override
			public void land() {
				System.out.println("land...");
			}
		};
		f.takeOff();
		f.fly();
		f.land();
	}

}
