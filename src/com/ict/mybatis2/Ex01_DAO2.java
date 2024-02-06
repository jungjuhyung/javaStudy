package com.ict.mybatis2;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class Ex01_DAO2 {
	private static SqlSession ss;
	
	private static SqlSession getSession() {
		if (ss == null) {
			ss= Ex01_DBService2.getFactoty().openSession();
		}
		return ss;
	}
	
	public static List<Ex01_VO2> getList() {
		List<Ex01_VO2> list = null;
		list = getSession().selectList("members.getSelectAll");
		return list;
	}
	
	public static Ex01_VO2 getOne(String idx) {
		Ex01_VO2 vo2 = null;
		vo2 = getSession().selectOne("members.getSelectOne", idx);
		return vo2;
	}
	public static int getCnt(){
		int result = 0;
		result = getSession().selectOne("members.getCount");
		return result;
	}
	public static int getIns(Ex01_VO2 vo2) {
		int result = 0;
		result = getSession().insert("members.getInsert", vo2);
		if (result > 0) {
			ss.commit();
		}
		return result;
	}
	public static int getDel(Ex01_VO2 vo2) {
		int result = 0;
		result = getSession().delete("members.getDelete", vo2);
		if (result > 0) {
			ss.commit();
		}
		return result;
	}
	public static int getUp(Ex01_VO2 vo2) {
		int result = 0;
		result = getSession().update("members.getUpdate", vo2);
		if (result > 0) {
			ss.commit();
		}
		return result;
	}
	public static Ex01_VO2 getLogin(Ex01_VO2 vo2) {
		Ex01_VO2 vo = null;
		vo = getSession().selectOne("members.Login", vo2);
		// 아이디 비교에 따른 반환값 설정 if
		if (vo != null) {
			// pw를 얻어내자(DB에 암호화 된 패스워드)
			String pw = vo.getPw();
			
			// 나중에 pw를 암호화 하자
			// 우리가 입력한 pw를 암호화하자(나중에)
			// String s_pw = vo2.getPw().암호화 메서드 사용 ;
			
			// db에서 꺼낸 pw와 암호화 된 pw를 비교하자(나중에)
			// 이것이 true이면 성공, false이면 실패
			if (true) {
				return vo;
			}else {
				return null;
			}
		}else {
			return null;
		}
	}
}
