package ch16_thread;

// Thread를 생성하는 방법2
public class RunnableExam implements Runnable {

	@Override
	public void run() {
		for(int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		// 현재 클래스의 인스턴스(객체) 생성
		RunnableExam e1 = new RunnableExam();
		
		// 스레드 생성 new Thread(Runnable을 구현한 객체)
//		Thread t1 = new Thread();	// 현재클래스와 연결이 안됨(매개변수로 현재 클래스의 인스턴스를 전달해야 함)
//		Thread t2 = new Thread();
//		Thread t1 = new Thread(e1, "스레드1");	// 스레드가 추가 생성됨
//		Thread t2 = new Thread(e1, "스레드2");
		Thread t1 = new Thread(e1);
		Thread t2 = new Thread(e1);
		t1.setName("스레드1");
		t2.setName("스레드2");
		
		t1.start();	// 스레드 실행 요청 => run()이 실행됨
		t2.start();
		
	}
}
