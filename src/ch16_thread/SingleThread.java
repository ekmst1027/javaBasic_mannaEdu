package ch16_thread;

// Thread : 거미줄, 프로그램의 작업단위
// Signel Thread
public class SingleThread {
	static void print() {
		// 현재 실행중인 스레드의 이름
		System.out.println(Thread.currentThread().getName());
		for(int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		print();
		print();
	}
	
	

}
