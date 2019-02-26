package ch07_object1;

public class StudentUse {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.input("김철수", "컴퓨터공학", 1, "2018001", 4.0, 5000000);
//		s1.setName("김철수");
//		s1.setMajor("컴퓨터공학");
//		s1.setYear(1);
//		s1.setNum("2018001");
//		s1.setPoint(3.5);
//		s1.setMoney(5000000);
		
		s1.print();
	}
}
