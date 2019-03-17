package ch21_jdbc;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DB {
	
	public static Connection getConn() {
		Connection conn = null;
		
		try {
			// DB 접속정보가 저장되어 있는 Properties 파일의 내용을 불러옴
			FileInputStream fis = new FileInputStream("/Users/kyeongmin/Documents/Java_study/db.prop");
			Properties prop = new Properties();
			prop.load(fis); 	// 파일 내용을 읽어서 Properties 객체로 저장
			String driver = prop.getProperty("driver");
			String url = prop.getProperty("url");
			String id = prop.getProperty("id");
			String password = prop.getProperty("password");
			Class.forName(driver);	// 생략 가능
			conn = DriverManager.getConnection(url, id, password);	// DB 접속
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
		
	}	// finish getConn() method
	
}	// finish DB class
