package ch08_constructor;

// static 멤버의 호출 방법
// 클래스이름.멤버
public class SingletonUse {
	public static void main(String[] args) {
//		Singleton a = new Singleton();
//		Singleton b = new Singleton();
//		Singleton c = new Singleton();
//		Singleton d = new Singleton();
		Singleton a = Singleton.getInstance();
		Singleton b = Singleton.getInstance();
		
	}
}
