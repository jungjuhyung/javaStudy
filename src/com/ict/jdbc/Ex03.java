package com.ict.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex03 {
	public static void main(String[] args) {
		// customer 테이블에 6, 이강인, 대한민국 제주도, 000-1234-9876 을 삽입하자.(insert into)
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		int result = 0;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##ictedu";
			String password = "1111";

			conn = DriverManager.getConnection(url, user, password);

			String sql1 = "insert into customer values(6, '이강인', '대한민국 제주도', '000-1234-9876')";

			stmt = conn.createStatement();

			result = stmt.executeUpdate(sql1);
			
			// 삽입 성공 여부 확인하기
			if (result > 0) {
				System.out.println(result + "삽입 성공");
				String sql2 = "select * from customer";
				rs = stmt.executeQuery(sql2);
				while (rs.next()) {
					System.out.print(rs.getInt(1) + "\t");
					System.out.print(rs.getString(2) + "\t");
					System.out.print(rs.getString(3) + "\t");
					System.out.print(rs.getString(4) + "\n");
				}

			} else {
				System.out.println("삽입 실패");
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				conn.close();
				stmt.close();
				rs.close();
			} catch (Exception e2) {
			}
		}

	}
}
