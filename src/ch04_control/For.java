package ch04_control;

public class For {
	public static void main(String[] args) {
		// args 스트링 배열참조변수
		// Integer.parseInt(문자열) => 숫자로 변환
		// "100" => 100
		// 배열참조변수.length => 배열의 크기
		if(args.length == 0) {
			System.out.println("명령행 매개변수를 입력하세요.");
			System.exit(0);	// 프로그램 강제 종료
		}
		
		int num = Integer.parseInt(args[0]);
		// for(초기식; 조건식; 증감식)
		// 조건식이 true일동안 반복 처리
		// 무한루프 주의
		for(int i = 1; i <= num; i++) {
			System.out.println(i);
		}
	}
}
