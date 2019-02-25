package ch06_method;

public class VoidExam {
	// 리턴 자료형(return type)
	// void : 리턴값이 없음
	static void hello() {
		System.out.println("안녕하세요.");
	}
	
	// main : 프로그램의 시작점
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		
		hello(); // method 호출
		
		System.out.println("프로그램 끝");
	}

}
