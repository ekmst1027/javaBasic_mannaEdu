package ch08_constructor;

public class Singleton {
	// static : 프로그램 시작부터 끝까지 메모리에 있음
	private static Singleton instance;
	public static Singleton getInstance() {
		// null일 때만 생성, 두번째부터는 넘어감
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
	// public 이었던 생성자를 private로 바꿈
	private Singleton() {
		System.out.println("기본 생성자 호출");
	}
	
	

}
