package ch19_io;

import java.io.Serializable;

// 객체 직렬화 : 객체 자체를 입출력하는 방법 = 객체 스트림 방식
//			  객체를 바이트 단위로 나누어 입출력이 가능하도록 하는 과정
//			  객체를 다른 곳으로 보낼 때(파일, 네트워크)
// 객체 역직렬화 : 파일, 네트워크에서 객체를 받을 때
// DTO : Data Transfer Object : 데이터를 전달하는 객체
// DAO : Data Access Object : 데이터 조작 객체
// 객체 직렬화를 하려면 Serializable 인터페이스를 구현해야 함

public class MemberDTO implements Serializable {
	private String name;
	private int age;
	// 포함 오브젝트(has a 관계 - 포함 관계)
	// transient : 일시적인, 잠시(객체직렬화에서 제외되는 요소)
	private transient MemberInfoDTO memberInfo;
	
	// getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
 	
	}
	
	public MemberInfoDTO getMemberInfo() {
		return memberInfo;
	}
	public void setMemberInfo(MemberInfoDTO memberInfo) {
		this.memberInfo = memberInfo;
	}
	
	
	// toString()
	@Override
	public String toString() {
		return "MemberDTO [name=" + name + ", age=" + age + "]";
	}
	
	// Constructor with parameters
	public MemberDTO(String name, int age, String jumin, String pwd) {
		super();
		this.name = name;
		this.age = age;
		this.memberInfo = new MemberInfoDTO(jumin, pwd);
	}
	
	
	
}
