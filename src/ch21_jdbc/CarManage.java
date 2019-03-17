package ch21_jdbc;

import java.util.List;
import java.util.Scanner;

public class CarManage {
	
	void delete() {
		Scanner scan = new Scanner(System.in);
		System.out.print("삭제할 차량번호 : ");
		String license_number = scan.nextLine();
		CarDAO dao = new CarDAO();
		
		// 삭제된 레코드 갯수가 result 변수에 리턴됨
		// 1이면 삭제 성공, 0이면 삭제 실패
		int result = dao.deleteCar(license_number);
		
		if(result == 1) {
			System.out.println("삭제되었습니다.");
		} else {
			System.out.println("차량번호를 확인하세요.");
		}	// finish if-else statment
		
	}	// finish delete() method
	
	void insert() {
		Scanner scan = new Scanner(System.in);
		System.out.print("차량번호 : ");
		String license_number = scan.nextLine();
		System.out.print("제조사 : ");
		String company = scan.nextLine();
		System.out.print("타입 : ");
		String type = scan.nextLine();
		System.out.print("제조연도 : ");
		int year = scan.nextInt();
		System.out.print("연비 : ");
		int efficiency = scan.nextInt();
		CarDAO dao = new CarDAO();
		CarDTO dto = new CarDTO(license_number, company, type, year, efficiency);
		dao.insertCar(dto);
		System.out.println("추가되었습니다.");
	}	// finish insert() method
	
	void list() {
		CarDAO dao = new CarDAO();
		List<CarDTO> items = dao.listCar();
		System.out.println("차량번호\t연도\t제조사\t타입\t연비");
		
		for (CarDTO dto : items) {
//			System.out.println(dto);	// CarDTO의 toString() 호출
			System.out.println(dto.getLicense_number() + "\t" + dto.getYear() + "\t" + 
								dto.getCompany() + "\t" + dto.getType() + "\t" + dto.getEfficiency());
		}	// finish for-each statement
		
	}	// finish list() method
	
	public static void main(String[] args) {
		CarManage manage = new CarManage();
		Scanner scan = new Scanner(System.in);	// 키보드 입력을 위한 객체
		// 무한 반복
		while(true) {
			System.out.print("작업을 선택하세요(1.목록, 2.추가, 3.삭제, 0.종료) : ");
			int code = scan.nextInt();
			switch(code) {
			case 0:
				scan.close();	// 스캐너 정리
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
				break;
			case 1:
				manage.list(); 	// 목록 출력
				break;
			case 2:
				manage.insert(); // 목록 추가
				break;
			case 3:
				manage.delete(); // 목록 삭제
				break;
				
			}	// finish switch - case statement
			
		}	// finish while statement
		
	}	// finish main() method

}	// finish CarManage class
