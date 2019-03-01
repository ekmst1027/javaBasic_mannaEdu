package ch14_collection;

import java.util.ArrayList;
import java.util.List;

public class ListMember {
	public static void main(String[] args) {
		// ArrayList 생성
		List<Member> list = new ArrayList<>();
		
		Member m1 = new Member();
		m1.setName("김철수");
		m1.setUserid("kim");
		m1.setPasswd("1234");
		m1.setTel("02-999-8888");
		m1.setEmail("kim@gmail.com");
		
		Member m2 = new Member();
		m2.setName("홍길동");
		m2.setUserid("hong");
		m2.setPasswd("2222");
		m2.setTel("02-988-5555");
		m2.setEmail("hong@daum.net");
		
		Member m3 = new Member();
		m3.setName("최순호");
		m3.setUserid("choi");
		m3.setPasswd("3333");
		m3.setTel("02-555-7777");
		m3.setEmail("choi@nate.com");
		
		Member m4 = new Member();
		m4.setName("조용필");
		m4.setUserid("cho");
		m4.setPasswd("9999");
		m4.setTel("02-333-2222");
		m4.setEmail("cho@nate.com");
		
		Member m5 = new Member();
		m5.setName("이상만");
		m5.setUserid("lee");
		m5.setPasswd("7777");
		m5.setTel("02-333-1111");
		m5.setEmail("lee@yahoo.co.kr");
		
		// 리스트에 멤버객체 추가 
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		list.add(m5);
		
		// 주소만 출력
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// 출력
		System.out.println("이름\t아이디\t비번\t전화\t\t이메일");
		for(int i = 0; i < list.size(); i++) {
			Member m = list.get(i);	// i번째 아이템을 꺼냄
			System.out.println(m.getName() + "\t" + m.getUserid() + "\t" + m.getPasswd() + 
					"\t" + m.getTel() + "\t" + m.getEmail());
		}
		
		// Member m = list.get(0);
		// Member m = list.get(1);
		// Member m = list.get(2);
		// Member m = list.get(3);
		// Member m = list.get(4);
		
		// m => 1e6d1014(주소값 전달) ==> 이 경우 toString()메소드를 오버라이드하여 사용하면 내용이 나옴
		// m.getName() .... => 값 출력
		
	}
}
