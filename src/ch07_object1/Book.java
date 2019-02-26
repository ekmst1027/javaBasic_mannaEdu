package ch07_object1;

//생성자(constructor)
// 1. 리턴타입이 없음
// 2. 클래스 이름과 같은 Method
// 3. 객체 생성 => 자동 호

public class Book {
	// 멤버변수(인스턴스 변수)
	private String bookName;
	private String author;	// 저자
	private String press;	// 출판사
	private int year;	// 출판연도
	private int price;	// 단가
	private int amount;	// 판매수령
	private int money;	// 판매금액(단가 X 판매수량)
	
	public Book() {
		System.out.println("생성자 호출");
	}
	
	public Book(String bookName, String author, String press,
			int year, int price, int amount) {
		System.out.println("매개변수가 있는 생성자");
		this.bookName = bookName;
		this.author = author;
		this.press = press;
		this.year = year;
		this.price = price;
		this.amount = amount;
	}
	
	// 계산
	public void calc() {
		money = amount * price;
	}
	
	// 출력
	public void print() {
		System.out.println("도서명\t저자\t출판사\t출판연도\t가격판매\t수량\t판매금액");
		System.out.println(bookName + "\t" + author + "\t" + press + 
				"\t" + year + "\t" + price + "\t" + amount + "\t" + money);
		
	}

}
