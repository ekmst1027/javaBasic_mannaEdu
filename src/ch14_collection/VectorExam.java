package ch14_collection;

import java.util.Vector;

public class VectorExam {
	public static void main(String[] args) {
		Vector<Object> v = new Vector<>();	// 벡터 객체 생성
		// 벡터에는 다양한 자료형을 저장할 수 있음.
		v.add("first");
		v.add(2); 
		v.add(3.5);
		
		// 벡터.size() : 	벡터 요소의 갯수
		System.out.println("초기 데이터");
		for(int i = 0; i < v.size(); i++) {
			System.out.print(v.get(i) + "\t");	// 벡터.get(인덱스) : 몇번째 값
		}
		
		// 벡터의 요소를 삭제
		System.out.println("\n1번 인덱스 삭제 후의 데이터");
		v.remove(1);	// 1번 인덱스
		for(int i = 0; i < v.size(); i++) {
			System.out.print(v.get(i) + "\t");	// 벡터.get(인덱스)
		}
		
		System.out.println("\n1번 인덱스에 데이터를 insert");
		// 벡터.add(인덱스, 데이터)
		v.add(1, 10.5);	// 1번 인덱스 위치에 10.5를 삽입
		for(int i = 0; i < v.size(); i++) {
			System.out.print(v.get(i) + "\t");	// 벡터.get(인덱스)
		}
	}

}
