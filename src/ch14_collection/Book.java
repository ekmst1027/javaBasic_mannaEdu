package ch14_collection;

import java.util.Scanner;

// java bean
// 데이터 전달 객체 : dto(Data Transfer Object) 
// vo(Value Object)
// model : 데이터를 담는 그릇
public class Book {
	private String bookName;
	private String press;
	private int price;
	private int amount;
	private int money;
	
	public Book() {};	// 기본생성자 
	
	public Book(String bookName, String press, int price, int amount) {
		this.bookName = bookName;
		this.press = press;
		this.price = price;
		this.amount = amount;
		money = price * amount;
	}
	
	// 스캐너로 스트링 입력
	// next() : 공백 이후 내용 무시됨
	// nextLine() : 공백 포함 입력됨
	public void input() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("도서명 : ");
			bookName = sc.nextLine();
			System.out.print("출판사 : ");
			press = sc.nextLine();
			System.out.print("단가 : ");
			price = sc.nextInt();
			System.out.print("수량 : ");
			amount = sc.nextInt();
			// 금액(단가 X 수량)
			money = price * amount;
		} catch (Exception e) {
			System.out.println("데이터 입력 오류가 발생했습니다.");
		}
//		sc.close();
	}
	
	
	// getters and setters
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getPress() {
		return press;
	}
	public void setPress(String press) {
		this.press = press;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getMoney() {
		return amount * price;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	

}
