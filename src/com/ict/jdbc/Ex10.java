package com.ict.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		// scanner로 수정할 번호 받고 이름, 주소, 전화번호 수정
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
				System.out.println("수정하실 번호를 작성해주세요");
				System.out.print("번호 : ");
				num = scan.nextInt();
				scan.nextLine();
				System.out.println("수정하실 정보를 작성해주세요");
				System.out.print("이름 : ");
				name = scan.nextLine();
				System.out.print("주소 : ");
				address = scan.nextLine();
				System.out.print("전화번호 : ");
				phone = scan.nextLine();
				String sql_update = "update customer set name=?, address=?, phone=? where custid = ?";
				pstmt = conn.prepareStatement(sql_update);
				pstmt.setString(1,name);
				pstmt.setString(2,address);
				pstmt.setString(3,phone);
				pstmt.setInt(4,num);
				result = pstmt.executeUpdate();
				if (result > 0) {
					System.out.println("수정 성공");
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
					System.out.println("수정 실패");
				}
				while (true) {
					System.out.print("계속 수정하시겠습니까? (y/n) : ");
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
