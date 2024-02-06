package com.ict.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		// scanner를 이용해서 번호, 이름, 주소, 전화번호를 받아서 customer테이블에 삽입 후 확인
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		int result = 0;
		
		Scanner scan = new Scanner(System.in);
		String num = "";
		String name = "";
		String address = "";
		String phone = "";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##ictedu";
			String password = "1111";
			
			conn = DriverManager.getConnection(url, user, password);
			stmt = conn.createStatement();
			String sql_t = "select * from customer";
			rs = stmt.executeQuery(sql_t);
			while (rs.next()) {
				System.out.print(rs.getInt(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString(3) + "\t");
				System.out.print(rs.getString(4) + "\n");
			}
			System.out.println("입력하실 정보를 작성해주세요");
			System.out.print("번호 : ");
			num = scan.next();
			System.out.print("이름 : ");
			name = scan.next();
			System.out.print("주소 : ");
			address = scan.next();
			System.out.print("전화번호 : ");
			phone = scan.next();
			String sql_insert = "insert into customer values('"+num+"', '"+name+"', '"+address+"', '"+phone+"')";
			result = stmt.executeUpdate(sql_insert);
			sql_t = "select * from customer";
			rs = stmt.executeQuery(sql_t);
			while (rs.next()) {
				System.out.print(rs.getInt(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString(3) + "\t");
				System.out.print(rs.getString(4) + "\n");
			}
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			try {
				scan.close();
				conn.close();
				stmt.close();
				rs.close();
			} catch (Exception e2) {
			}
		}
		
		
		
		
	}
}
