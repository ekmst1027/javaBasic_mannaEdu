package ch14_collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapExam {
	public static void main(String[] args) {
		String[] nation = {"한국", "일본", "중국", "미국", "태국", "영국"};
		String[] city = {"서울", "동경", "북경", "워싱턴", "방콕", "런던"};
		
		// 해시맵 HashMap<Key 자료형, Value 자료형>
		Map<String, String> map = new HashMap<>();
		map.put("한국", "서울");
		map.put("일본", "동경");
		map.put("중국", "북경");
		map.put("미국", "워싱턴");
		map.put("태국", "방콕");
		map.put("영국", "런던");
		
//		for(int i = 0; i < city.length; i++) {
//			map.put(nation[i], city[i]);
//		}
		
		// 맵에 저장된 자료조회 : map.get(key)
		System.out.println(map);	// 입력된 순서대로 저장되지 않음, 빠르게 찾는 것이 목적
//		System.out.println(map.get("태국"));
		
		System.out.println(map.keySet());	// 키집합
		System.out.println(map.values());	// 값집합
		
		// map.keySet() : 맵의 키집합 리턴
		// Iterator : 집합 데이터를 반복 처리하는 클래스
		Iterator<String> iterator = map.keySet().iterator();
		while(iterator.hasNext()) {	// 다음 요소가 있으면
			String key = (String)iterator.next();	// 다음 요소로 이동
			System.out.print("key : " + key);
			System.out.println(", value : " + map.get(key));
		}
		
	}
}
