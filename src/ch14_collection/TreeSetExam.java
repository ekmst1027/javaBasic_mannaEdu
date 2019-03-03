package ch14_collection;

import java.util.Set;
import java.util.TreeSet;

// TreeSet : 중복을 허용하지 않고, 데이터 정렬 기능 제공
public class TreeSetExam {
	public static void main(String[] args) {
		Set<String> ts = new TreeSet<>();
		
		ts.add("포도");
		ts.add("사과");
		ts.add("배");
		ts.add("딸기");
		ts.add("사과");	// 중복값은 입력되지 않음
		
		for(String str : ts) {
			System.out.println(str);
		}
	}

}
