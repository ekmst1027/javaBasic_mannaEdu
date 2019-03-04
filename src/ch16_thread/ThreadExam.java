package ch16_thread;

// class 자식 extends 부모
// ThreadExam is kind of a Thread
public class ThreadExam extends Thread {
//	public ThreadExam(String name) {
//		// 부모클래스(Thread)의 생성자 호출
//		super(name);
//	}
	
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
	
	// main 스레드 실행
	public static void main(String[] args) {
		// 스레드 생성
//		ThreadExam e1 = new ThreadExam("스레드 1");
//		ThreadExam e2 = new ThreadExam("스레드 2");
//		ThreadExam e3 = new ThreadExam("스레드 3");
		
		ThreadExam e1= new ThreadExam();
		ThreadExam e2= new ThreadExam();
		ThreadExam e3= new ThreadExam();
		
		// 스레드 이름 설정
		e1.setName("스레드 1");
		e2.setName("스레드 2");
		e3.setName("스레드 3");
		
		// 스레드 실행
		e1.start();	// run()이 호출됨
		e2.start();
		e3.start();
	}
}
