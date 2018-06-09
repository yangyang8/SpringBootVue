package com.hailong.service.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hailong.entity.User;
import com.hailong.mapper.UserMapper;
import com.hailong.service.UserService;

@Service
@Transactional  //开启事务注解相关操作
public class UserServiceImpl implements UserService{
	
	//注入UserMapper对象
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public List<User> findAll(Map map) {
		return userMapper.findAll(null);
	}

	@Override
	public User findOne(String id) {
		return userMapper.findOne(id);
	}

	@Override
	public void deleteById(Serializable id) {
		userMapper.deleteById(id);
	}

	@Override
	public void update(User user) {
		userMapper.update(user);
	}

	@Override
	public void insert(User user) {
		userMapper.insert(user);
	}

}
