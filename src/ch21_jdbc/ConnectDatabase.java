package ch21_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// mysql 서버에 접속 테스트
public class ConnectDatabase {
	public static void main(String[] args) {
		// DB연결 문자열 jdbc:mysql://host/db
		String url = "";
		String id = "";	// mysql 계정 비번
		String password = ""; // mysql 계정 비번
		// DB접속 처리
		Connection conn = null;	// java.sql.Connection
		
		// SQL 명령어를 실행시키는 객체
		Statement stmt = null;	// java.sql.Statement
		
		// SELECT 명령어의 결과를 처리하는 객체
		ResultSet rs = null;	// java.sql.ResultSet
		
		// DB연동작업은 반드시 예외처리 필수!
		try {
			//mysql 연결 드라이버 클래스 이름
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버 로딩 성공");
			
			conn = DriverManager.getConnection(url, id, password);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// DB연동 관련 리소스 정리
			// 오픈한 역순으로 닫음 
			// ResultSet => Statement => Connection
			try {
				if(rs != null) {
					rs.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if(stmt != null) {
					stmt.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
