package ch16_thread;

// 스레드를 구현한 부분을 외부클래스로 분리
public class MyThread extends Thread {
	// 기본 생성자 추가
	public MyThread() {
		
	}
	
	// 매개변수가 있는 생성자 추가
	public MyThread(String name) {
		// 스레드의 이름을 설정
		super(name);	// Thread 클래스의 생성자 호출
	}
	
	@Override
	public void run() {
		for(int i = 1; i <= 5; i++) {
			// 현재 실행중인 스레드의 이름
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
