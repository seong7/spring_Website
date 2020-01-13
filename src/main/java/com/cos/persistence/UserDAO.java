package com.cos.persistence;

import com.cos.domain.UserVO;

public interface UserDAO {
	public void insert(UserVO userVo) throws Exception;
	public int logIn(UserVO userVo) throws Exception; 
	public UserVO select(String userID) throws Exception; 
}
