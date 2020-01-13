package com.cos.service;

import com.cos.domain.UserVO;

public interface UserService {
	public void insert(UserVO userVo) throws Exception;
	public int select(UserVO userVo) throws Exception;
}
