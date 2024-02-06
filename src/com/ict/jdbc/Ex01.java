package com.ict.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

// .jar 자바로 압축했다는 뜻으로 자바 라이브러리는 모두 .jar이다
// 자기 회사에서 만든 자기 라이브러리를 API
// 다른 회사나 개인이 해당 언어나 프로그램을 지원하는 것을 라이브러리

//java에서 실행한 sql문은 자동으로 commit이 되지만
// java에서 seletc로 가져오는 테이블은 commit된 데이터들이고
// java에서 update를 통해 데이터를 조작하면 자동 commit 되는 것이다.
				
// sqldeveloper는 commit을 해야한다.

// 1. 자바와 오라클을 연결하주는 드라이버가 필요하다
// 	그런데 sqldeveloper에 드라이브가 존재한다. 해당 드라이버를 찾아서 util에 복사하기
// 	sqldeveloper에 있는jdbc폴더에서 ojdbc11 파일을 찾아서 util 폴더로 복사
// 2. 이클립스 왼쪽 창에서 studyjava 폴더에서 마우스 우클릭 후 build path 클릭
// 3. 나오는 창에서 library 쪽에서 addexternal jars로 폴더 찾아가소 ojdbc11 넣기
// 
public class Ex01 {
	public static void main(String[] args) {
		// 순서 무조건 지켜야한다.
		
		// java에서 실행한 sql문은 자동으로 commit이 되지만
		// java에서 seletc로 가져오는 테이블은 commit된 데이터들이고
		// java에서 update를 통해 데이터를 조작하면 자동 commit 되는 것이다.
				
		// sqldeveloper는 commit을 해야한다.
		
		// 1. java를 오라클에 접속할 수 있도록 도와주는 인터페이스 Connection, java.sql
		Connection conn = null;
		
		// 2. SQL 구문 작성
		// Statement 인터페이스 사용 java.sql
		Statement stmt = null;
		
		// 3-1. 결과를 받은 클래스(select일때)
		ResultSet rs = null;
		
		// 3-2. 결과를 받은 변수(select가 아닐때)
		int result = 0;
		
		try {
			// 4. jdbc 드라이버 로딩 : 오라클, MySQL, mariaDB 각각 회사마다 다르게 로딩해야한다.
			// 우리는 ojdbc11 library 드라이버를 로딩한것
			// 옆에 Referenced Libraries에서 확인 가능
			// oracle.jdbc.driver 여기까지가 패키지 이름
			// 아래 코드를 통해 오라클과 연결할 드라이버 import
			// 대소문자 정확히 구분해야함
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 5. 오라클과 연결 하기 위한 정보
			// 원래는 아래 같은 접속아이디는 따로 만들어서 은닉해야하는데 일단은 이렇게 함
			// jdbc:oracle:thin:@  여기까지는 회사에서 제공
			// localhost:1521:xe  여기는 DB가 있는 컴퓨터 서버 정보 입력
			// localhost는 현재 자기가 작업중인 컴퓨터 ip
			// 대소문자 정확히 구분해야함
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##ictedu";
			String password = "1111";
			
			// 6. 오라클에 연결하기
			conn = DriverManager.getConnection(url, user, password);
			
			// 7. sql 작성
			String sql = "select * from customer";
			// where 조건을 붙여서 보낼 수도 있다.
			//String sql = "select * from customer where custid = 3";
			
			// 8. sql를 보내기 위해서 구문을 만듬
			stmt = conn.createStatement();
			
			// 9. 보내기 + 결과 받기
			// 9-1. select 문인 경우 executeQuery 사용
			rs = stmt.executeQuery(sql);
			
			// 9-2. insert, update, delete 인 경우 executeUpdate
			//result = stmt.executeUpdate(sql);
			
			// re.next() = 해당 행에 자료가 있으면 true 반환하고 다음행으로 이동
			// re.getxxxx(index = 1부터)
			// xxxx에는 자료형이 들어가야한다.
			// 위치값이지만 sql에서는 1부터 시작
			// 튜플 한줄씩 읽어올 수 있다.
			while (rs.next()) {
				System.out.print(rs.getInt(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getString(3)+"\t");
				System.out.print(rs.getString(4)+"\n");
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				
			}
		}
		
		
		
	}
}
