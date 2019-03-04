package ch16_thread;

// 싱글 스레드(Single Thread) : 순차적 작업 A ==> B
// 멀티 스레드(Multi Thread) : 동시 작업 A,B가 동시에 실행
//							ex, 기본 스레드 - paint(), 백그라운드 스레드 - run()
// join : join method를 호출한 스레드가 종료될 때까지 현재의 스레드를 대기시킴
public class ThreadJoin extends Thread {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + "스레드가 시작되었습니다.");
		for(int i = 1; i <= 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName() + "스레드가 종료되었습니다.");
	}
	
	public static void main(String[] args) {
		// 현재 실행중인 스레드의 이름
		System.out.println(Thread.currentThread().getName() + "스레드가 시작되었습니다.");
		
		ThreadJoin e = new ThreadJoin();
		e.setName("백그라운드 스레드");
		e.start();	// run() method가 실행됨
		
		// 현재 스레드(백그라운드 스레드)가 종료될 때까지 다른 스레드(메인 스레드)의 실행을 중지시킴
		try {
			e.join();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}		
		
		System.out.println(Thread.currentThread().getName() + "스레드가 종료되었습니다.");
	}
	
}
