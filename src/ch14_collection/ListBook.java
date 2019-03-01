package ch14_collection;

import java.util.ArrayList;
import java.util.List;

public class ListBook {
	public static void main(String[] args) {
		// ArrayList 생성
		List<Book> list = new ArrayList<>();
		// ArrayList에 자료 추가
//		Book b1 = new Book();
//		b1.setBookName("자바");
//		b1.setPress("삼성출판사");
//		b1.setPrice(30000);
//		b1.setAmount(100);
////		b1.setMoney(b1.getPrice()*b1.getAmount());	// getter method에 대신 만듦
//		list.add(b1);
//		
//		Book b2 = new Book("jsp", "영진출판사", 35000, 200);
//		list.add(b2);
//		
//		Book b3 = new Book("오라클", "한빛출판사", 40000, 150);
//		list.add(b3);
		
		Book b1 = new Book();
		b1.input();
		Book b2 = new Book();
		b2.input();
		Book b3 = new Book();
		b3.input();
		
		list.add(b1);
		list.add(b2);
		list.add(b3);
		
		
		System.out.println("도서명\t출판사\t단가\t수량\t금액");
		for (Book b : list) {
			System.out.println(b.getBookName() + "\t" + b.getPress() + "\t" + b.getPrice() + 
					"\t" + b.getAmount() + "\t" + b.getMoney());
		}
	}
}
