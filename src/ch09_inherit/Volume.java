package ch09_inherit;

// Area 클래스를 상속받아 기능을 확장한 클래스
// 상속제외 : private, 생성자
public class Volume extends Area {
	private int height;
	
	public Volume(int width, int length, int height) {
		super(width, length);
		this.height = height;
	}
	
	public int getVolume() {
		return getArea() * height;
	}

}

// this. => 현재 클래스의 멤버 호출
// this() => 현재 클래스의 다른 생성자 호출
// super. => 부모 클래스의 멤버 호출
// super() => 부모 클래스 생성자 호출