package ch10_static;

public class StaticVar2Use {
	public static void main(String[] args) {
		// static => 클래스이름으로 접근 가능, 객체생성x
		System.out.println(StaticVar2.total);
		// nonstatic => 객체생성 후 사용 가능
		StaticVar2 car1 = new StaticVar2("소나타");
		StaticVar2 car2 = new StaticVar2("모닝");
		StaticVar2 car3 = new StaticVar2("아반테");
		System.out.println(car1.model);
		System.out.println(car2.model);
		System.out.println(car3.model);
		System.out.println(StaticVar2.total);
		
	}
}
