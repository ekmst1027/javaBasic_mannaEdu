package ch14_collection;

import java.util.ArrayList;

// ArrayList : Vector와 사용법이 비슷하지만 좀더 가볍고 속도가 빠름 
public class ListExam {
	public static void main(String[] args) {
		ArrayList<Object> list = new ArrayList<>();	// ArrayList 선언
		
		// ArrayList에는 다양한 자료형을 저장할 수 있음.
		// 리스트.add(추가할 데이터)
		// 하나 2 5.5 4 false
		list.add("하나");
		list.add(2);
		list.add(5.5);
		list.add(false);
		list.add(3, 4);	// 3번 인덱스에 값(4) 추가
		list.remove(1);	// 1번 인덱스의 값 삭제
		
		// 리스트.size() : 요소의 갯수
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + "\t");	// 리스트.get(인덱스) => 몇 번째 인덱스에 저장된 데이터
		}
	}

}
