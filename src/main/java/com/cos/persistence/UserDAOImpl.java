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
								//namespace : Mapper.xml 에서 설정한 namespce 값

	@Override
	public void insert(UserVO userVo) throws Exception {
		session.insert(namespace+".insert", userVo);
								// .insert : Mapper.xml 에서 id 값이 insert 인 태그를 찾아감
	}


	@Override
	public int logIn(UserVO userVo) throws Exception {
		return session.selectOne(namespace+".logIn", userVo);
	}


	@Override
	public UserVO select(String userID) throws Exception {
		return session.selectOne(namespace+".select", userID);
	}

}
