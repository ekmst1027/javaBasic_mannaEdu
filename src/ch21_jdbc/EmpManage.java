package ch21_jdbc;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

public class EmpManage {
	private EmpDAO dao;
	public EmpManage() {
		dao = new EmpDAO();
	}
	
	void delete() {
		Scanner scan = new Scanner(System.in);
		System.out.print("삭제할 사번을 입력하세요 : ");
		int empno = scan.nextInt();
		// 레코드 삭제 처리, 삭제된 레코드 갯수가 result로 저장됨
		int result = dao.deleteEmp(empno);
		
		if(result == 1) {
			System.out.println("삭제되었습니다.");
			
		} else {
			System.out.println("존재하지 않는 사번입니다.");
		}	// finish if-else statement
		
	}	// finish delete() method
	
	void insert() {
		Scanner scan = new Scanner(System.in);
		System.out.print("사번 : ");
		int empno = scan.nextInt();
		
		System.out.print("이름 : ");
		String ename = scan.next();
		
		System.out.print("입사일자 : ");
		String hiredate = scan.next();
		
		System.out.print("급여 : ");
		int sal = scan.nextInt();
		
		EmpDTO dto = new EmpDTO(empno, ename, Date.valueOf(hiredate), sal);
		dao.insertEmp(dto);	// 레코드가 추가됨
		
		System.out.println("저장되었습니다.");
		
	}	// finish insert() method
	
	void list() {
		List<EmpDTO> items = dao.listEmp();
		System.out.println("사번\t이름\t입사일자\t\t급여");
		
//		for(int i = 0; i < items.size(); i++) {
//			EmpDTO dto = items.get(i);	// i번째 자료 조회
//			System.out.print(dto.getEmpno() + "\t");
//			System.out.print(dto.getEname() + "\t");
//			System.out.print(dto.getHiredate() + "\t");
//			System.out.print(dto.getSal() + "\t");
//		}
		
		for (EmpDTO dto : items) {
			System.out.print(dto.getEmpno() + "\t");
			System.out.print(dto.getEname() + "\t");
			System.out.print(dto.getHiredate() + "\t");
			System.out.print(dto.getSal() + "\t");
			System.out.println();
		}	// finish for-each statement
		
	}	// finish list() method
	
	public static void main(String[] args) {
		EmpManage emp = new EmpManage();
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("메뉴를 선택하세요(1.목록, 2.추가, 3.삭제, 0.종료) : ");
			int code = scan.nextInt();
			switch(code) {
			case 0:
				System.exit(0);
				break;
			case 1:
				emp.list();
				break;
			case 2:
				emp.insert();
				break;
			case 3:
				emp.delete();
				break;
				
			}	// finish switch statement
			
		}	// finish while statement
		
	}	// finish main() method

}	// finish EmpManage class
