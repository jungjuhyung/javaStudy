package com.ict.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int result = 0;
		Scanner scan = new Scanner(System.in);

		// PreparedStatement select하기
		try {
			System.out.print("검색 번호 받기 : ");
			int custid = scan.nextInt();
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##ictedu";
			String password = "1111";

			conn = DriverManager.getConnection(url, user, password);
			
			// ? = 동적 바인딩 변수 => 실행할 때 값을 넣어줌으로써 정해지는 변수
			String sql = "select * from customer where custid = ?";
			pstmt = conn.prepareStatement(sql);
			
			//
			pstmt.setInt(1, custid);
			
			rs = pstmt.executeQuery();

			while (rs.next()) {
				System.out.print(rs.getInt(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString(3) + "\t");
				System.out.print(rs.getString(4) + "\n");
			}

		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				scan.close();
				rs.close();
				pstmt.close();
				conn.close();
			} catch (Exception e2) {

			}
		}
	}
}
