package ch09_inherit;

public class Area {
	// 멤버변수, 전역변수, 필드(field)
	private int width;
	private int length;
	
	public Area() {}	// 기본생성자(default constructor)
	
	public Area(int width, int length) {
		this.width = width;
		this.length = length;
	}
	
	public int getArea() {
		return width * length;
	}

}
