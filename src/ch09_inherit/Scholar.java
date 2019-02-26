package ch09_inherit;

// class A extends B : B 클래스를 상속받음
public class Scholar extends Student {
	private String category;
	private int money;
	
	// 입력
	public void input(String name, String num, String major,
			int year, String category, int money) {
		// this 현재 클래스의 멤버를 가리킴
		// super 부모 클래스의 멤버를 가리킴
//		super.name = name;
//		super.num = num;
//		super.major = major;
//		super.year = year;
		super.input(name, num, major, year);
		this.category = category;
		this.money = money;
	}
	
	// 출력
	public void print() {
		System.out.println("이름\t학번\t전공\t학년\t구분\t장학금액");
//		System.out.println(getName() + "\t" + getNum() + "\t" + getMajor() + "\t" + getYear() + "\t" + category + "\t" + money);
		System.out.println(name + "\t" + num + "\t" + major + "\t" + year + "\t" + category + "\t" + money);
	}

}
