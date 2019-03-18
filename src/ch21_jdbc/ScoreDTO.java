package ch21_jdbc;


// MVC pattern :
//	Model(모델, 데이터 저장/처리 로직)
//	View(뷰, 화면 처리 클래스)
//	Controller(컨트롤러, 프로그램의 흐름 제어)
public class ScoreDTO {
	private String student_no;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int tot;
	private double avg;
	
	// Constructor
	public ScoreDTO() {
	}
	
	public ScoreDTO(String student_no, String name, int kor, int eng, int mat) {
		this.student_no = student_no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		// 총점, 평균값 계산
		tot = kor + eng + mat;
		avg = tot / 3.0;
	}

	// getters and setters
	public String getStudent_no() {
		return student_no;
	}
	public void setStudent_no(String student_no) {
		this.student_no = student_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getTot() {
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	// toString() method
	@Override
	public String toString() {
		return "ScoreDTO [student_no=" + student_no + ", name=" + name + ", kor=" + kor + ", eng=" + eng + ", mat="
				+ mat + ", tot=" + tot + ", avg=" + avg + "]";
	}
	
}	// finish scoreDTO class
