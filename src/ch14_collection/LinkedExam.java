package ch14_collection;

import java.util.LinkedList;

// 스택(Stack) 구조 - LIFO(Last In First Out) : 나중에 입력된 것이 먼저 출력됨
// 큐(Queue) 구조 - FIFO(First In First Out) : 먼저 입력된 것이 먼저 출력됨
public class LinkedExam {
	public static void main(String[] args) {
		String[] fruits = {"사과", "포도", "바나나", "키위", "수박"};
		
		LinkedList<String> list = new LinkedList<>();
		for(String str : fruits) {
			list.offer(str);	// 링크드 리스트에 자료 입력
		}
		
		String str = "";
		// poll() 자료 출력
		while((str=(String)list.poll()) != null) {
			System.out.println(str+"==> 삭제됨");
		}
	}

}
