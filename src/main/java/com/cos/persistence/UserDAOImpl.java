package com.cos.persistence;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cos.domain.UserVO;

@Repository
public class UserDAOImpl implements UserDAO{
	
	@Autowired
	private SqlSession session;
	private static final String namespace = "com.cos.domain.user";
	

	@Override
	public void insert(UserVO userVo) throws Exception {
		session.insert(namespace+".insert", userVo);
	}


	@Override
	public int select(UserVO userVo) throws Exception {
		return session.selectOne(namespace+".select", userVo);
	}

}
