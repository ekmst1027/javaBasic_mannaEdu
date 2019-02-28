package ch13_useful;

public class Member {
	private String name;
	private int age;
	private double height;
	
	public Member(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}
	
	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + ", height=" + height + "]";
	}
	
	public static void main(String[] args) {
		Member m = new Member("김철수", 20, 180.5);
		System.out.println(m);
	}
	
}
