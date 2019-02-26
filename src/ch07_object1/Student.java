package ch07_object1;

// class = 멤버변수 + method
public class Student {
	private String name;
	private String major;
	private int year;
	private String num;
	private double point;
	private int money;
	private int save;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public double getPoint() {
		return point;
	}
	public void setPoint(double point) {
		this.point = point;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getSave() {
		return save;
	}
	public void setSave(int save) {
		this.save = save;
	}
	
	public void input(String name, String major, int year, String num,
			double point, int money) {
		// this.변수 => 멤버변수(클래스 전체에서 사용하는 변수)
		this.name = name;
		this.major = major;
		this.year = year;
		this.num = num;
		this.point = point;
		this.money = money;
		if(point >= 4.3) {
			save = money;
		} else if(point >= 4.0) {
			save = 2500000;
		} else if(point >= 3.5) {
			save = 1000000;
		}
	}
	
	public void print() {
		System.out.println("이름\t전공\t학년\t학번\t평점\t등록금\t장학금");
		System.out.println(name + "\t" + major + "\t" + year + "\t" + num + 
				"\t" + point + "\t" + money + "\t" + save);
	}
	
	

}
