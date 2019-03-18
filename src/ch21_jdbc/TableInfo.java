package ch21_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class TableInfo {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		ResultSetMetaData meta = null;	// 테이블의 메타데이터 제공
		try {
			conn = DB.getConn();
			String sql = "SELECt * FROM score";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			meta = rs.getMetaData();	// 테이블의 메타데이터가 리턴됨
			int cols = meta.getColumnCount();	// 필드 갯수
			System.out.println("필드명\t자료형\tNull허용여부");
			for(int i = 1; i <= cols; i++) {
				String colName = meta.getColumnName(i);	// 필드 이름
				String colType = meta.getColumnTypeName(i);	// 필드 자료형
				int isNull = meta.isNullable(i);	// null 허용 여부
				System.out.println(colName + "\t" + colType + "\t" + isNull);
			}
					
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if(pstmt != null)pstmt.close();
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
