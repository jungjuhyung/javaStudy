package com.ict.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

// DB 처리하는 메서드들을 가지고 있는 클래스

public class Ex01_DAO {
	// MyBatis에서 실제 사용하는 클래스는 SqlSession
	private static SqlSession ss;
	
	// 싱글턴 패턴(동기화 처리까지)
	private synchronized static SqlSession getSession() {
		if (ss==null) {
			//openSession()은 위에 2개 빼고는 잘안씀. 맨위는 autocommit을 안하고 아래는 autocommit을 하는것이다.
			// autocommit 안하는 연습
			ss = Ex01_DBService.getFactoty().openSession();
		}
		return ss;
	}
	
	// DB 처리하는 메서드들 => mapper.xml을 호출하는 메서드
	// select : 결과(resultType) 여러개, 하나 구분
	//			파라미터(parameterType)가 없냐, 하나인가, 두개 이상인가
	// customer 테이블의 전체 내용 보기 : 결과 - 여러개 - List<VO>
	// 								파라미터는 없다.
	public static List<Ex01_VO> getList(){
		// 바로 return해도 되지만 insert같은 것들은 commit을 해줘야하기 때문에
		// 변수로 받아서 return하는 습관을 가지자
		List<Ex01_VO> list = null;
		// selectList()는 결과가 여러개일 때 사용
		// selectList()에는 파라미터가 있는 것과 없는 것으로 나뉜다.
		// getSession().selectList("mapper.xml의 namespace.id");
		list = getSession().selectList("customer.getSelectAll");
		return list;
	}
	// customer 테이블의 특정 데이터보기
	// select : 하나(vo 또는 int 또는 String)
	public static Ex01_VO getOne(String custid){
		Ex01_VO vo = null;
		vo = getSession().selectOne("customer.getSelectOne", custid);
		return vo;
	}
	public static int getCnt(){
		int result = 0;
		result = getSession().selectOne("customer.getCount");
		return result;
	}
	
	// insert, upset, delete는 결과가 무조건 int
	// insert, upset, delete는 결과를 무조건 commit해줘야한다.
	// 파라미터 타입이 하나일 때는 vo, String, int...가능
	// 파라미터 타입이 여러개이면 무조건 VO를 만들어서 넣기
	
	public static int getIns(Ex01_VO vo){
		int result = 0;
		result = getSession().insert("customer.getInsert", vo);
		if (result >0) {
			ss.commit();
		}
		return result;
	}
	public static int getDel(Ex01_VO vo){
		int result = 0;
		result = getSession().delete("customer.getDelete", vo);
		if (result >0) {
			ss.commit();
		}
		return result;
	}
	public static int getUp(Ex01_VO vo){
		int result = 0;
		result = getSession().update("customer.getUpdate", vo);
		if (result >0) {
			ss.commit();
		}
		return result;
	}
}
