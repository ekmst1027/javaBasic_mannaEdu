package ch14_collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExam {
	public static void main(String[] args) {
		// 중복값을 허용하지 않음
		Set<String> hs = new HashSet<String>();
		
		hs.add("포도");	// 자료 추가
		hs.add("사과");
		hs.add("배");
		hs.add("딸기");
		hs.add("사과");	// 입력되지 않음
		
		for(String str : hs) {
			System.out.println(str);
		}
		
		System.out.println();
		
		// Iterator : 집합데이터를 반복처리하는 클래스
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {	// 다음 요소가 있으면
			// 다음 요소를 리턴받음
			System.out.println(it.next());
		}
	}
}
