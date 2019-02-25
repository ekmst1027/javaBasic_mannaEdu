package ch05_array;

// 성적 계산(배열)
public class ArrayPoint {
	public static void main(String[] args) {
		// 배열 선언
		String[] name = {"김철수", "이성용", "성민수", "강찬호", "이순영"};
		int[] kor = {100, 80, 70, 60, 90};
		int[] eng = {80, 90, 95, 85, 75};
		int[] mat = {99, 89, 79, 69, 77};
		int[] tot = { 0, 0, 0, 0, 0};
		double[] avg = {0.0, 0.0, 0.0, 0.0, 0.0};
		double tot_avg = 0;	// 학급평균합계
		
		// 총점, 평균, 계산(반복문)
		for(int i = 0; i < name.length; i++) {
			tot[i] = kor[i] + eng[i] + mat[i];
			avg[i] = tot[i] / 3.0;
			tot_avg = tot_avg + avg[i];
		}
		
		// 결과 출력(반복문)
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		for(int i = 0; i < 5; i++) {
			System.out.println(name[i]+"\t"+kor[i]+"\t"+eng[i]+"\t"+mat[i]+
					"\t"+tot[i]+"\t"+String.format("%.1f", avg[i]));
		}
		System.out.println("학급평균 : " + String.format("%.1f", tot_avg/5));
	}
}
