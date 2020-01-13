package com.cos.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.cos.domain.UserVO;
import com.cos.persistence.UserDAO;

@Service
public class UserServiceImpl implements UserService{
	
	@Inject
	private UserDAO dao;

	@Override
	public void insert(UserVO userVo) throws Exception {
		dao.insert(userVo);
	}

	@Override
	public int logIn(UserVO userVo) throws Exception {
		return dao.logIn(userVo);
	}
	
	@Override
	public UserVO select(String userID) throws Exception {
		return dao.select(userID);
	}
}
