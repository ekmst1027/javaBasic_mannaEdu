package ch16_thread;

public class ExternThread {
	public static void main(String[] args) {
		// 스레드를 구현한 클래스의 객체 생성
//		MyThread t1 = new MyThread("스레드1");
//		MyThread t2 = new MyThread("스레드2");
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		t1.setName("스레드1");
		t2.setName("스레드2");
		
		// 스레드 작업 할당 요청
		t1.start();	// run()이 호출됨
		t2.start();
	}
}
