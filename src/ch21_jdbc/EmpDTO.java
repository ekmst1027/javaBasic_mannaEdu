package ch21_jdbc;

import java.sql.Date;

// DTO : Data Transfer Object - 데이터를 저장, 전달하는 객체
// VO : Value Object
public class EmpDTO {
	private int empno;
	private String ename;
	private Date hiredate;	// java.sql.Date
	private int sal;
	
	// Constructor
	public EmpDTO() {
 	}
	
	public EmpDTO(int empno, String ename, Date hiredate, int sal) {
		this.empno = empno;
		this.ename = ename;
		this.hiredate = hiredate;
		this.sal = sal;
	}

	// Getters and Setters
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	
	// toString() method
	@Override
	public String toString() {
		return "EmpDTO [empno=" + empno + ", ename=" + ename + ", hiredate=" + hiredate + ", sal=" + sal + "]";
	}

}	// finish EmpDTO class
