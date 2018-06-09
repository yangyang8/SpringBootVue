package com.hailong.service;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.hailong.entity.User;

public interface UserService {

	//查询所有的相关操作
		public List<User> findAll(Map map);
		
		//查询一个操作
		public User findOne(String id);
		
		//删除操作
		public void deleteById(Serializable id);
		
		//更新操作
		public void update(User user);
		
		//插入操作
		public void insert(User user);

}
