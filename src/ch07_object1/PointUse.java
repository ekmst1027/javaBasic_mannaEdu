package ch07_object1;

public class PointUse {
	public static void main(String[] args) {
		// Point 클래스의 객체(인스턴스) 생성,
		// 객체의 시작번지값을 참조변수 p1에 전달
		Point p1 = new Point();
		p1.setName("김철수");
		p1.setKor(88);
		p1.setEng(99);
		p1.setMat(100);
		p1.print();
//		p1.setTot(p1.getKor() + p1.getEng() + p1.getMat());
//		p1.setAvg(p1.getTot() / 3.0);
//		p1.name = "김철수";
		// 객체참조변수.멤버변수
//		p1.kor = 88;
//		p1.eng = 99;
//		p1.mat = 100;
//		p1.tot = p1.kor + p1.eng + p1.mat;
//		p1.avg = p1.tot / 3.0;
		
//		switch((int)(p1.getAvg()/10)) {
//		case 10:
//		case 9: p1.setGrade("수"); break;
//		case 8: p1.setGrade("우"); break;
//		case 7: p1.setGrade("미"); break;
//		case 6: p1.setGrade("양"); break;
//		default: p1.setGrade("가"); break;
//		}
		
//		switch((int)(p1.avg / 10)) {
//		case 10:
//		case 9:
//			p1.grade = "수";
//			break;
//		case 8:
//			p1.grade = "우";
//			break;
//		case 7:
//			p1.grade = "미";
//			break;
//		case 6:
//			p1.grade = "양";
//			break;
//		default:
//			p1.grade = "가";
//			break;
//		}
//		System.out.println("이름 : " + p1.name);
		
		
		// 두 번째 학생 
//		Point p2 = new Point();
////		p2.name = "이문수";
//		p2.setName("이문수");
//		p2.kor = 95;
//		p2.eng = 89;
//		p2.mat = 77;
//		p2.tot = p2.kor + p2.eng + p2.mat;
//		p2.avg = p2.tot / 3.0;
//		
//		switch((int)(p2.avg / 10)) {
//		case 10:
//		case 9:
//			p2.grade = "수";
//			break;
//		case 8:
//			p2.grade = "우";
//			break;
//		case 7:
//			p2.grade = "미";
//			break;
//		case 6:
//			p2.grade = "양";
//			break;
//		default:
//			p2.grade = "가";
//			break;
//		}
////		System.out.println("이름 : " + p2.name);
//		System.out.println("이름 : " + p2.getName());
//		System.out.println("국어 : " + p2.kor);
//		System.out.println("영어 : " + p2.eng);
//		System.out.println("수학 : " + p2.mat);
//		System.out.println("총점 : " + p2.tot);
//		System.out.println("평균 : " + p2.avg);
//		System.out.println("등급 : " + p2.grade);
		
	}
}
