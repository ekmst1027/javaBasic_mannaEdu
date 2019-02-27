package ch12_inner;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// java.awt 패키지의 Frame class : 윈도우 관련 기능 제공
public class InnerExam extends Frame {
	public InnerExam() {	// 생성자
		// 프레임(윈도우창)의 타이틀 설정
		// super.멤버 => 부모클래스의 멤버 호출
		// super() => 부모클래스의 생성자 호출
		// 생성자 : 클래스 이름과 같은 method, 리턴 타입이 없음, 객체가 생성될 때 자동 호출
		// this.멤버 => 내 클래스의 멤버 호출
		// this() => 내 클래스의 생성자 호출
		super("내부 클래스 테스트");	// 부모클래스(Frame)의 생성자 호출
		setSize(300, 400);	// 윈도우의 가로, 세로 길이
		setVisible(true);	// 윈도우를 화면에 표시
	}
	
	public static void main(String[] args) {
		InnerExam e = new InnerExam();
		// 참조변수.add...Listener(new ...Listener);
		// 이벤트소스.이벤트리스너(이벤트핸들러)
		// 무명 클래스, 익명 클래스 
		e.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);	// 프로그램 강제 종료
			}
		});
	}
}

// 이벤트(Event) : 시스템과 사용자의 상호 작용
// 이벤트 소스 : 이벤트가 일어나는 대상, 이벤트를 적용할 대상
// 이벤트 리스너 : 이벤트가 일어나는지 감시하는 역할
// 이벤트 핸들러 : 이벤트가 일어났을 때 처리할 코드
