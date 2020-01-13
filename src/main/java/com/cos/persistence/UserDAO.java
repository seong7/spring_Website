package com.cos.persistence;

import com.cos.domain.UserVO;

public interface UserDAO {
	public void insert(UserVO userVo) throws Exception;
	public int select(UserVO userVo) throws Exception; 
}
