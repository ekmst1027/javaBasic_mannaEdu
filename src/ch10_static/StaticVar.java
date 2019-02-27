package ch10_static;

// static : 프로그램 시작시 로등, 끝날때 삭제
public class StaticVar {
	static int a = 10;	// static member
	int b = 20;	// nonstatic member
	
//	public static void main(String[] args) {
//		System.out.println(a);
////		System.out.println(b);
//		
//		// nonstatic member는 객체가 생성된 후 사용 가능
//		StaticVar s = new StaticVar();
//		System.out.println(s.b);
//	}
}
