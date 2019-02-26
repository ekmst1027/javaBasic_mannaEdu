package ch07_object1;

public class PersonUse {
	public static void main(String[] args) {
		Person p1 = new Person();
		
		// 객체참조변수.변수
		// . : 멤버연산자
//		p1.name = "김철수";
		// p1.age = 20;
		// p1.height = 170.5;
		
		p1.setName("김철수");
		p1.setAge(20);
		p1.setHeight(170.5);
		
//		System.out.println("이름 : " + p1.name);
//		System.out.println("나이 : " + p1.age);
//		System.out.println("키 : " + p1.height);
//		System.out.println("이름 : " + p1.getName());
//		System.out.println("나이 : " + p1.getAge());
//		System.out.println("키 : " + p1.getHeight());
		p1.print();
	}
}
