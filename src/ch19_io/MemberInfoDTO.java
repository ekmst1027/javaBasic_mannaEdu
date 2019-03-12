package ch19_io;

import java.io.Serializable;

public class MemberInfoDTO implements Serializable {
	private String juminNo;
	private String passwd;
	
	// getters and setters
	public String getJuminNo() {
		return juminNo;
	}
	public void setJuminNo(String juminNo) {
		this.juminNo = juminNo;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	
	// toString()
	@Override
	public String toString() {
		return "MemberInfoDTO [juminNo=" + juminNo + ", passwd=" + passwd + "]";
	}
	
	// Constructor with parameters
	public MemberInfoDTO(String juminNo, String passwd) {
		this.juminNo = juminNo;
		this.passwd = passwd;
	}

}
