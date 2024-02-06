package com.ict.mybatis;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

// SqlSessionFactory를 만들기 위해서는 SqlSessionFactoryBuilder의 build를 사용해서 얻어야한다.
// SQLSession을 사용하기 위해서는 SqlSessionFactory객체가 필요하기 때문에 하는 작업이다.
public class Ex01_DBService {
	static private SqlSessionFactory factory;
	static String resource = "com/ict/mybatis/ex01_config.xml";
	// static 초기화
	static {
		try {
			InputStream in = Resources.getResourceAsStream(resource);
			factory = new SqlSessionFactoryBuilder().build(in);
		} catch (Exception e) {
		}
	}
	
	// DAO에서 factory를 호출할 메서드
	public static SqlSessionFactory getFactoty() {
		return factory;
		
	}
}
