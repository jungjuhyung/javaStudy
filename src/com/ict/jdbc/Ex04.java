package com.ict.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex04 {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		int result = 0;
		// delete 해보기

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##ictedu";
			String password = "1111";

			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();

			String sql1 = "delete from customer where name = '이강인'";
			result = stmt.executeUpdate(sql1);
			if (result > 0) {
				System.out.println(result + "제거 성공");
				String sql2 = "select * from customer";
				rs = stmt.executeQuery(sql2);
				while (rs.next()) {
					System.out.print(rs.getInt(1) + "\t");
					System.out.print(rs.getString(2) + "\t");
					System.out.print(rs.getString(3) + "\t");
					System.out.print(rs.getString(4) + "\n");
				}
			}else {
				System.out.println("제거 실패");
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
