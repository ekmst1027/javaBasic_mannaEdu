package ch07_object1;

public class BookUse {
	public static void main(String[] args) {
		// 클래스의 객체(인스턴스) 생성
//		Book b1 = new Book();
		Book b1 = new Book("java", "김선생", "영진", 2018, 30000, 10);
		b1.calc();	// 계산
		b1.print();	// 출력
	}
}
