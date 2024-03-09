package com.example.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mapper.UserMapper;
import com.example.service.UserService;
import com.example.vo.UserVO;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserMapper userMapper;
	
	@Override
	public UserVO getUser(String uid) {
		
		return this.userMapper.getUser(uid);
	}

}
