package com.ict.mybatis2;

import java.util.List;
import java.util.Scanner;

import com.ict.mybatis.Ex01_DAO;
import com.ict.mybatis.Ex01_VO;

public class Ex01_Main2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Ex01_VO2> list = null;
		esc: while (true) {
			list = Ex01_DAO2.getList();
			prn(list);
			System.out.println();
			System.out.println("선택하세요");
			System.out.println("1. members테이블 특정 데이터 보기");
			System.out.println("2. members테이블 데이터 삽입");
			System.out.println("3. members테이블 데이터 삭제");
			System.out.println("4. members테이블 데이터 수정");
			System.out.println("5. members테이블 데이터 총 갯수");
			System.out.println("6. members테이블 로그인하기");
			System.out.println("7. 그만하기");
			System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>  ");
			int menu = scan.nextInt();

			switch (menu) {
			case 1:
				System.out.print("검색할 idx : ");
				String idx = scan.next();
				Ex01_VO2 vo2 = Ex01_DAO2.getOne(idx);
				prn(vo2);
				break;
			case 2:
				System.out.println("삽입 정보를 입력하세요");
				System.out.print("번호 : ");
				String idx2 = scan.next();
				System.out.print("아이디 : ");
				String id = scan.next();
				System.out.print("비밀번호 : ");
				String pw = scan.next();
				System.out.print("이름 : ");
				String username = scan.next();
				System.out.print("나이 : ");
				String age = scan.next();
				int result = Ex01_DAO2.getIns(new Ex01_VO2(idx2, id, pw, username, age, ""));
				if (result > 0) {
					System.out.println("삽입 성공");
					list = Ex01_DAO2.getList();
					prn(list);
				} else {
					System.out.println("삽입 실패");
				}
				break;
			case 3:
				System.out.print("삭제할 idx : ");
				String idx3 = scan.next();
				result = Ex01_DAO2.getDel(new Ex01_VO2(idx3, "", "", "", "", ""));
				if (result > 0) {
					System.out.println("삭제 성공");
					list = Ex01_DAO2.getList();
					prn(list);
				} else {
					System.out.println("삭제 실패");
				}
				break;
			case 4:
				System.out.println("수정할 정보를 입력하세요");
				System.out.print("번호 : ");
				String idx4 = scan.next();
				System.out.print("아이디 : ");
				id = scan.next();
				System.out.print("비밀번호 : ");
				pw = scan.next();
				System.out.print("이름 : ");
				username = scan.next();
				System.out.print("나이 : ");
				age = scan.next();
				result = Ex01_DAO2.getUp(new Ex01_VO2(idx4, id, pw, username, age, ""));
				if (result > 0) {
					System.out.println("수정 성공");
					list = Ex01_DAO2.getList();
					prn(list);
				} else {
					System.out.println("수정 실패");
				}
				break;
			case 5:
				result = Ex01_DAO2.getCnt();
				System.out.println("총 맴버수 : " + result);
				break;
			case 6:
				System.out.println("아이디와 비밀번호를 입력하세요");
				System.out.print("아이디 : ");
				id = scan.next();
				System.out.print("비밀번호 : ");
				pw = scan.next();
				
				Ex01_VO2 vo5 = new Ex01_VO2();
				vo5.setId(id);
				vo5.setPw(pw);
				
				Ex01_VO2 vo6 =Ex01_DAO2.getLogin(vo5);
				if (vo6!=null) {
					System.out.println("로그인 성공");
				}else {
					System.out.println("로그인 실패");
				}
				break;
			case 7:
				System.out.println("bye~~");
				break esc;

			default:
				break;
			}

		}
	}

	public static void prn(List<Ex01_VO2> list) {
		System.out.println("번호\tID\tPW\t이름\t나이\t가입날짜");
		for (Ex01_VO2 k : list) {
			System.out.print(k.getIdx() + "\t");
			System.out.print(k.getId() + "\t");
			System.out.print(k.getPw() + "\t");
			System.out.print(k.getUsername() + "\t");
			System.out.print(k.getAge() + "\t");
			System.out.print(k.getRegdate() + "\n");
		}
	}

	public static void prn(Ex01_VO2 vo2) {
		System.out.println("번호\tID\tPW\t이름\t나이\t가입날짜");
		System.out.print(vo2.getIdx() + "\t");
		System.out.print(vo2.getId() + "\t");
		System.out.print(vo2.getPw() + "\t");
		System.out.print(vo2.getUsername() + "\t");
		System.out.print(vo2.getAge() + "\t");
		System.out.print(vo2.getRegdate() + "\n");

	}
}
