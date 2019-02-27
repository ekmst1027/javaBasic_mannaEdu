package ch10;

class AA {
	int a = 10;
	public void print() {
		System.out.println(a);
	}
}

class BB extends AA {
	int a = 20;
	
	// 어노테이션(annotation) 코드에 대한 주석
	@Override
	public void print() {
		System.out.println(a);
	}
}

// 다형성(polymorphism) : 부모클래스의 참조변수로 자식클래스의 메소드호출
public class Poly {
	public static void main(String[] args) {
		BB b = new BB();
		b.print();
		
		// 좌변 부모, 우변 자식
		// 부모참조변수로 호출했으나 자식 method가 호출됨
		AA aa = new BB();
		System.out.println(aa.a);	// 부모클래스의 변수가 호출됨
		aa.print();	// 자식 클래스의 메소드 호출(오버라이딩된 메소드가 호출됨)
	}
}
