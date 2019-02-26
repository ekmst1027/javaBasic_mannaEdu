package ch07_object1;

public class Member {
	// 멤버변수
	private String name;
	private String userid;
	private int money;
	private String grade;
	
	public Member() {
		System.out.println("기본 생성자");
	}
	
	public Member(String name, String userid, int money) {
		System.out.println("매개변수가 있는 생성자");
		this.name = name;
		this.userid = userid;
		this.money = money;
	}
	
	public void input(String name, String userid, int money) {
		this.name = name;
		this.userid = userid;
		this.money = money;
	}
	
	// 구매금액이 10만원 이상이면 골드회원
	public void setGrade() {
		grade = money >= 100000 ? "골드" : "실버";
//		if(money >= 100000) {
//			grade = "골드";
//		} else {
//			grade = "실버";
//		}
	}
	
	public void print() {
		System.out.println("이름\t아이디\t구매금액\t등급");
		System.out.println(name + "\t" + userid + "\t" + money + "\t" + grade);
	}
}
