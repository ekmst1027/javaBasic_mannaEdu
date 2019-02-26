package ch08_constructor;

public class Person {
	private String name;
	private int height;
	private int weight;
	
	// 생성자 오버로딩
	public Person() {	// 기본생성자
		// this() 다른 생성자 호출
		this("김철수", 150, 100);	// 네번째 생성자가 호출됨
	}
	
	public Person(String name) {
		this(name, 190, 100);
	}
	
	public Person(String name, int height) {
		this(name, height, 50);
	}
	
	public Person(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	public void showInfo() {
		System.out.println("===신상 정보===");
		System.out.println("이름 : " + name);
		System.out.println("신장 : " + height);
		System.out.println("체중 : " + weight);
	}

}
