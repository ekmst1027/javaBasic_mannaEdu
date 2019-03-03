package ch15_exception;

// 예외처리방법
// try ~ catch : 직접 처리 (자세한 예외처리)
// throws : 예외처리 클래스에 처리 위임 (간단한 예외처리)
// 			메소드이름 throws 예외처리클래스1, 예외처리클래스2 { }
//			main method 내부의 코드를 실행하다가 예외가 발생하면 
//			직접 처리하지 않고 throws 뒤에 지정한 예외처리클래스에 처리를 위임
public class ThrowsExam {
	public static void main(String[] args) throws InterruptedException {
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
			// CPU를 강제로 쉬게 함
			// 인터럽트(interrupt) - CPU 간섭
			// 1000밀리세컨드 => 1초
			Thread.sleep(1000);
		}
	}
}
