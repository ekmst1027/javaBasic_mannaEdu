package ch21_jdbc;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class Property {
	public static void main(String[] args) {
		Connection conn = null;	// DB 접속 객체
		PreparedStatement pstmt = null;	// SQL실행 객체
		ResultSet rs = null;	// select 쿼리의 결과셋을 탐색하는 객체
		
		try {
			// 파일의 내용을 읽기 위한 객체
			FileInputStream fis = new FileInputStream("/Users/kyeongmin/Documents/Java_study/db.prop");
			// key = value 구조로 저장된 파일을 읽거나 쓰기 위한 객체
			Properties prop = new Properties();
			prop.load(fis);	// 파일 내용을 읽어서 prop에 로딩
			System.out.println(prop);
			
			// properties 파일에 있는 값을 불러옴
			String driver = prop.getProperty("driver");
			String url = prop.getProperty("url");
			String id = prop.getProperty("id");
			String password = prop.getProperty("password");
			
			// properties 파일에 기록
			prop.setProperty("pwd", "java1234");
			FileOutputStream fos = new FileOutputStream("/Users/kyeongmin/Documents/Java_study/db.prop");
			// prop.sotre(출력스트림, 주석)
			prop.store(fos, "test");
			
			Class.forName(driver);	// driver 클래스 로딩
			// db에 접속
			conn = DriverManager.getConnection(url, id, password);
			String sql = "SELECT * FROM books";	// sql 문장 작성
			pstmt = conn.prepareStatement(sql);	// sql을 실행시키는 객체 생성
			rs = pstmt.executeQuery();	// sql 실행 후 결과셋을 rs에 전달
			System.out.println("도서코드\t도서이름\t가격");
			// 다음 레코드가 존재하면 true
			while(rs.next()) {
				// 결과셋.get자료명("필드명")
				System.out.println(rs.getString("book_id") + "\t"
						+ rs.getString("title") + "\t" 
						+ rs.getInt("price"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			
		} finally {
			// 오픈 순서 : Connection => PreparedStatement => ResultSet
			// 닫는 순서 : ResultSet => PreparedStatement => Connection
			try {
				if(rs != null) rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if(pstmt != null) pstmt.close();
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
