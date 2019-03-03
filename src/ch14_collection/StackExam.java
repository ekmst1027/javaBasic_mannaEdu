package ch14_collection;

import java.util.Stack;

// Stack class(LIFO, Last Input First Out)
public class StackExam {
	public static void main(String[] args) {
		String[] nation = {"한국", "일본", "중국", "미국", "영국"};
		
		Stack<String> s = new Stack<>();	// 스택 객체
		for(String str : nation) {
			s.push(str);	// 스택에 푸쉬(입력)
		}
		
		// 스택의 최근 자료부터 추출
//		System.out.println(s.pop());	// 스택에서 팝(출력)
//		System.out.println(s.pop());	// 스택에서 팝(출력)
//		System.out.println(s.pop());	// 스택에서 팝(출력)
//		System.out.println(s.pop());	// 스택에서 팝(출력)
//		System.out.println(s.pop());	// 스택에서 팝(출력)
//		System.out.println(s.pop());	// 스택에서 팝(출력)
		
		while(!s.isEmpty()) {	// 스택이 비어있지 않으면
			System.out.println(s.pop());
		}
	}
}
