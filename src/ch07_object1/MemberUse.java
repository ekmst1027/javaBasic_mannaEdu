package ch07_object1;

public class MemberUse {
	public static void main(String[] args) {
		Member m1 = new Member();	// 객체(인스턴스) 생성
		m1.input("김철수", "kim", 200000);	// 입력
		m1.setGrade();	// 계산
		m1.print();	// 출력
		
		// 객체가 만들어진 뒤 두번째 생성자가 자동으로 호출됨
		Member m2 = new Member("김사장", "kim2", 50000);
		m2.setGrade();
		m2.print();
	}
}
