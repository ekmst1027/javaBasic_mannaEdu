package ch13_useful;

// extends 클래스 상속, implements 인터페이스 구현
public class Clone implements Cloneable {
	int num = 10;
	void print() {
		System.out.println(num);
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
		
	public static void main(String[] args) {
		Clone t1 = new Clone();
		Clone t2 = null;
		try {	// 예외가 발생할 가능성이 있는 코드
			t2 = (Clone)t1.clone();
		} catch (CloneNotSupportedException e) {
			// 예외가 발생했을 때 처리하는 코드
			e.printStackTrace();	// 예외가 발생했을 때의 스택 정보를 콘솔에 출력
		}
		// 객체가 복제되었으므로 서로 다른 주소값이 출력됨
		System.out.println(t1);
		System.out.println(t2);
		t1.print();
		t2.print();
		
	}
}
