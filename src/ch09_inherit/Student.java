package ch09_inherit;

public class Student {
	// 멤버변수
//	private String name;
//	private String num;
//	private String major;
//	private int year;
	protected String name;
	protected String num;
	protected String major;
	protected int year;
	
	public Student() {}	// 기본생성자
	// 매개변수가 있는 생성자
	public Student(String name, String num, String major, int year) {
		this.name = name;
		this.num = num;
		this.major = major;
		this.year = year;
	}
	
	// getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	// 입력
	public void input(String name, String num, String major, int year) {
		this.name = name;
		this.num = num;
		this.major = major;
		this.year = year;
	}
	
	// 출력
	public void print() {
		System.out.println("이름\t학번\t전공\t학년");
		System.out.println(name + "\t" + num + "\t" + major + "\t" + year);
	}
}
