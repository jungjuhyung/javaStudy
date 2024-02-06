package com.ict.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		// scanner로 번호, 이름, 주소, 전화번호 받아서 customer 테이블에 삽입하기
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int result = 0;
		
		Scanner scan = new Scanner(System.in);
		int num = 0;
		String name = "";
		String address = "";
		String phone = "";
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##ictedu";
			String password = "1111";
			
			conn = DriverManager.getConnection(url, user, password);
			esc : while (true) {
				String sql_t = "select * from customer";
				pstmt = conn.prepareStatement(sql_t);
				rs = pstmt.executeQuery();
				while (rs.next()) {
					System.out.print(rs.getInt(1) + "\t");
					System.out.print(rs.getString(2) + "\t");
					System.out.print(rs.getString(3) + "\t");
					System.out.print(rs.getString(4) + "\n");
				}
				System.out.println("입력하실 정보를 작성해주세요");
				System.out.print("번호 : ");
				num = scan.nextInt();
				scan.nextLine();
				System.out.print("이름 : ");
				name = scan.nextLine();
				System.out.print("주소 : ");
				address = scan.nextLine();
				System.out.print("전화번호 : ");
				phone = scan.nextLine();
				String sql_insert = "insert into customer values(?,?,?,?)";
				pstmt = conn.prepareStatement(sql_insert);
				pstmt.setInt(1,num);
				pstmt.setString(2,name);
				pstmt.setString(3,address);
				pstmt.setString(4,phone);
				result = pstmt.executeUpdate();
				if (result > 0) {
					System.out.println("삽입 성공");
					sql_t = "select * from customer";
					pstmt = conn.prepareStatement(sql_t);
					rs = pstmt.executeQuery();
					while (rs.next()) {
						System.out.print(rs.getInt(1) + "\t");
						System.out.print(rs.getString(2) + "\t");
						System.out.print(rs.getString(3) + "\t");
						System.out.print(rs.getString(4) + "\n");
					}
				}else {
					System.out.println("삽입 실패");
				}
				while (true) {
					System.out.print("계속 입력하시겠습니까? (y/n) : ");
					String kkk = scan.nextLine();
					if (kkk.equalsIgnoreCase("y")) {
						continue esc;
					}else if (kkk.equalsIgnoreCase("n")) {
						break esc;
					}else {
						System.out.println("다시 입력해주세요");
						continue;
					}
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			try {
				scan.close();
				conn.close();
				pstmt.close();
				rs.close();
			} catch (Exception e2) {
			}
		}
		System.out.println("bye~~~");
	}
}
