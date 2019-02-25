package ch04_control;

import java.util.Scanner;

// 배송료 계산(구매금액이 2만원 이상이면 배송료 면제, 아니면 2000원,
// 포인트 적립 금액이 1만원 이상이면 포인트 사용 가능
public class Cost {
	public static void main(String[] args) {
		// 변수 선언
		String name = ""; // 이름
		int price = 0;	// 구매금액
		int point = 0;	// 포인트
		int point_use = 0;	// 포인트 사용액
		int fee = 0;	// 배송료
		int pay;	// 실제 결제금액
		// 자료 입력(선택)
		Scanner scan = new Scanner(System.in);
		System.out.print("이름을 입력하세요 : ");
		name = scan.nextLine();
		System.out.print("가격을 입력하세요 : ");
		price = scan.nextInt();
		System.out.print("포인트를 입력하세요 : ");
		point = scan.nextInt();
		
		// 구매금액이 2만원 미만이면 배송료 2천원
		if(price < 20000) {
			fee = 2000;
		}
		
		// 포인트 적립액이 1만원 이상이면 포인트 사용 가능
		if(point >= 10000) {
			point_use = point;
			pay = price + fee - point;
		} else {
			pay = price + fee;
		}
		System.out.println("이름\t구매금액\t배송료\t포인트사용\t\t결제금액");
		// String.format("출력형식", 출력할값)
		// %d : 정수형 => %,d : 천단위 콤마 추가
		System.out.println(name + "\t" + price + "\t" + fee + "\t" + point_use + "\t\t" + String.format("%,d", pay));
	}

}
