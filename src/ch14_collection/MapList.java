package ch14_collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Map<K, V>
public class MapList {
	public static void main(String[] args) {
		// 해시맵 생성 Map<Key 자료형, Value 자료형>
		Map<String, Object> map = new HashMap<>();
		
		// ArrayList 생성
		List<Student> list = new ArrayList<>();
		
		// ArrayList에 Student 객체 추가
		list.add(new Student("2017001", "kim", "국사", 2, "park"));
		list.add(new Student("2016001", "park", "국문", 3, "lee"));
		list.add(new Student("2015001", "hong", "영문", 4, "choi"));
		
		// 해시맵에 ArrayList 추가
		map.put("list", list);
		System.out.println(map);
		
		// map.put(key, value) : 맵에 자료 저장
		// map.get(key) : 자료 조회
		List<Student> list2 = (List<Student>)map.get("list");
		for(Student s : list2) {
			System.out.println(s);
		}
	}

}
