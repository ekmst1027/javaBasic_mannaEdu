package ch14_collection;

import java.util.ArrayList;
import java.util.List;

public class ListStudent {
	public static void main(String[] args) {
		// Student 자료형만 추가 가능한 ArrayList 생성
		List<Student> list = new ArrayList<>();
		
		Student s1 = new Student();
		s1.setName("박군");
		s1.setNum("2018001");
		s1.setYear(1);
		s1.setMajor("체육");
		s1.setProfessor("최교수");
		list.add(s1);
		
		Student s2 = new Student("2017001", "서군", "미술", 2, "최교수");
		list.add(s2);
		
		Student s3 = new Student("2016001", "김군", "전산", 3, "이교수");
		list.add(s3);
		
		// 오버라이드된 toString() 사용
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// 일반 for문 사용
		System.out.println("학번\t이름\t전공\t학년\t지도교수");
		for(int i = 0; i < list.size(); i++) {
			Student s = list.get(i);
			System.out.println(s.getNum() + "\t" + s.getName() + "\t" + s.getMajor() + 
					"\t" + s.getYear() + "\t" + s.getProfessor());
		}
		
		// foreach문 사용
		System.out.println("학번\t이름\t전공\t학년\t지도교수");
		for (Student s : list) {
			System.out.println(s.getNum() + "\t" + s.getName() + "\t" + s.getMajor() + 
					"\t" + s.getYear() + "\t" + s.getProfessor());
			
		}
	}
}
