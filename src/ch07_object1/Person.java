package ch07_object1;

public class Person {
	// private 멤버 => 외부에서 접근할 수 없음
	private String name;
	// 같은 패키지에서는 접근 가능 (default)
	private int age;
	private double height;
	
	// public 멤버 => 모든 곳에서 접근 가능
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public void print() {
		System.out.println("이름\t나이\t키");
		System.out.println(name + "\t" + age + "\t" + height);
	}
	
	
}
