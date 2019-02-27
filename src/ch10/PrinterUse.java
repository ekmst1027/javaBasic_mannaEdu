package ch10;

public class PrinterUse {
	public static void main(String[] args) {
//		DotPrinter p1 = new DotPrinter();
//		p1.print();
//		InkjetPrinter p2 = new InkjetPrinter();
//		p2.print();
//		LaserPrinter p3 = new LaserPrinter();
//		p3.print();
		
		// 다형성을 적용한 코드
		// 좌변 부모자료형, 우변 자식자료형
		// 자식 클래스의 method가 호출됨
		Printer p = new DotPrinter();
		p.print();
		p = new InkjetPrinter();
		p.print();
		p = new LaserPrinter();
		p.print();
		
		
	}
}
