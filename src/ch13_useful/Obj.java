package ch13_useful;

// Object class : 최상위 클래스(모든 클래스에서 기본적으로 상속 처리됨)
public class Obj {	// extends Object { // Object 클래스가 기본적으로 상속됨
	public static void main(String[] args) {
		Obj e1 = new Obj();
		System.out.println(e1.getClass());	// 클래스의 정보
		// 패키지.클래스@해쉬코드(주소값)
		System.out.println(e1);	// 객체의 주소값
		// Object를 문자열로 변환(toString())
		System.out.println(e1.toString());
	}
}
