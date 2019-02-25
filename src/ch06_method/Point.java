package ch06_method;

public class Point {
	// 전역 변수, 멤버 변수
	static String[] name = {"홍선영", "이민주", "이정호", "차두리", "박지성"};
	static int[] kor = {80, 90, 100, 60, 70};
	static int[] eng = {90, 99, 77, 66, 88};
	static int[] mat = {80, 60, 80, 90, 100};
	static int[] tot = {0, 0, 0, 0, 0};
	static int[] avg = {0, 0, 0, 0, 0};
	
	static void getTot() {	// 총점 계산 
		for(int i = 0; i < name.length; i++) {
			tot[i] = kor[i] + eng[i] + mat[i];
		}
	}
	
	static void getAvg() {	// 평균 계산
		for(int i = 0; i < name.length; i++) {
			avg[i] = tot[i] / 3;
		}
	}
	
	static void print() {	// 결과 출력
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		for(int i = 0; i < name.length; i++) {
			System.out.println(name[i] + "\t" + kor[i] + "\t" + eng[i] + "\t" + 
								mat[i] + "\t" + tot[i] + "\t" + avg[i]);
		}
		
	}
	
	public static void main(String[] args) {
		getTot();	// 총점 계산
		getAvg();	// 평균 계산
		print();	// 출력 
	}

}
