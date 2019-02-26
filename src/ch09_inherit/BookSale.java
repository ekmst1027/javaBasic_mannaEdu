package ch09_inherit;

public class BookSale extends Book {
	private int amount;
	private int rank;
	private int money;
	
	// getters and setters
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getRank() {
		return rank;
	}
	public void setRank(int rank) {
		this.rank = rank;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney() {
		money = price * amount; // 금액 = 단가 X 수량
		// 금액이 10만원을 넘으면 10% 할인
		if(money > 100000) money = (int)(money * 0.9);
	}
	
	public void print() {
		System.out.println("도서명\t출판사\t저자\t출판연도\t단가\t판매수량\t판매금액\t\t판매순위");
		System.out.println(bookName + "\t" + press + "\t" + author + "\t" + year + 
				"\t" + price + "\t" + amount + "\t" + money + "\t" + rank);
	}
	
	
	
	
}
