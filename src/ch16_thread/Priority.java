package ch16_thread;

public class Priority extends Thread {
	// 생성자 추가
	public Priority(String name) {
		super(name);	// Thread 클래스의 생성자 호출
	}
	
	
	
	@Override
	public void run() {
		for(int i = 1; i <= 5000; i++) {
			// 현재 실행중인 스레드의 이름 출력
			System.out.println(Thread.currentThread().getName() + " ==> " + i);
		}
	}
	
	// main 스레드
	public static void main(String[] args) {
		// 백그라운드 스레드 생성
		Priority e1 = new Priority("스레드1");
		Priority e2 = new Priority("스레드2");
		// 스레드의 이름 설정
//		e1.setName("스레드1");
//		e2.setName("스레드2");
		// 1 (최저) ~ 10 (최고), 5(기본)
		e1.setPriority(Thread.MIN_PRIORITY);
		e2.setPriority(Thread.MAX_PRIORITY);
		System.out.println(e1.getPriority());
		System.out.println(e2.getPriority());
		e1.start();
		e2.start();
	}

}
