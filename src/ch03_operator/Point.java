package ch03_operator;

import java.util.Scanner;

// 국어, 영어, 수학 점수를 입력받아 총점, 평균 출력
public class Point {
	public static void main(String[] args) {
		// 변수 선언
		String name;
		int kor, eng, mat, tot;
		double avg;
		
		// 입력 객체 생성
		// Scanner : 키보드 입력 지원 클래스
		// System.in : 표준입력장치(키보드)
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 : ");
		name = scan.nextLine();	// 스트링(한줄)
		System.out.print("국어 점수 : ");
		kor = scan.nextInt();	// 정 입력
		System.out.print("수학 점수 : ");
		eng = scan.nextInt();	// 정수 입력
		System.out.print("영어 점수 : ");
		mat = scan.nextInt();	// 정수 입력
		scan.close();	// 스캐너 객체가 사용중인 메모리 정리
		
		// 계산
		tot = kor + eng + mat;	// 총점
		avg = tot / 3.0;	// 평균
		
		// 결과 출력
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.printf(
				"%s\t%d\t%d\t%d\t%d\t%5.1f",
				name, kor, eng, mat, tot, avg
				);
		// String.format("출력형식", 출력할값들)
		// % 출력할 위치
		// 전차자리수.소수이하자리수
		// f 실수형, d 정수형, s 문자열
	}
}
