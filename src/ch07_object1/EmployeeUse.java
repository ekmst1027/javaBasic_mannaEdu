package ch07_object1;

public class EmployeeUse {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.input("김철수", "관리팀", "팀장", 4000000);
		e1.calc();
		e1.print();
	}
}
