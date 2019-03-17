package ch21_jdbc;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class SQLInsertTest {
	public static void main(String[] args) {
		Connection conn = null;	// DB 접속을 위한 객체
		Statement stmt = null;	// sql 문장을 실행시키는 객체
		try {
			// DB 접속에 필요한 정보들을 properties 파일에 저장한 후 불러오는 방식
			FileInputStream fis = new FileInputStream("/Users/kyeongmin/Documents/Java_study/db.prop");
			Properties prop = new Properties();
			
			// properties 파일에 저장된 내용들을 불러옴
			prop.load(fis);
			// key = value
			String driver = prop.getProperty("driver");
			String url = prop.getProperty("url");
			String id = prop.getProperty("id");
			String password = prop.getProperty("password");
			System.out.println("driver : " + driver);
			System.out.println("url : " + url);
			System.out.println("id : " + id);
			System.out.println("password : " + password);
			
			Class.forName(driver);	// driver 클래스 로딩
			conn = DriverManager.getConnection(url, id, password);	// db 접속
			String title = "c언어";
			String publisher = "금성출판사";
			int year = 2017;
			int price = 45000;
			String sql = "INSERT INTO books (title, publisher, year, price)"
					+ " VALUES ('" + title + "','" + publisher + "','" + year + "'," + price + ")";
			
			System.out.println(sql);
			
			stmt = conn.createStatement();	// Statement 객체 생성
			stmt.executeUpdate(sql);	// sql이 실행됨(레코드가 추가됨)
			System.out.println("추가되었습니다.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 리소스 정리, 역순으로 닫아줌
			try {
				if(stmt != null) stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if(conn != null) conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
