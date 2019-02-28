package ch13_useful;

public class ObjCast {
	public static void main(String[] args) {
		int a = 10;
		Object obj = new Object();
		// 좌변 부모, 우변 자식 => 가능
		obj = 20;
		// 좌변 자식, 우변 부모 => 에러(형변환 해야함)
//		a = (int)obj;
		a = (Integer)obj;
		System.out.println(a);
		
		Object[] obj2 = {100, 100.5, true, "hello", 'A'};
//		Object[] obj2;	// 배열참조변수 선언
//		obj2 = new Object[5];	// 배열생성
//		obj2[0] = 100;	// obj2[0] = new Integer(100);
//		obj2[1] = 100.5;	// obj2[1] = new Double(100.5);
		for(Object o : obj2) {
			System.out.println(o);
		}
	}
}
