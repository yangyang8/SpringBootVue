package com.hailong.mapper;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * 基本的Mapper的数据，主要是做了增删改查相关操作
 * @author Administrator
 *
 */
public interface BaseMapper<T> {
	//分页查询操作
	public List<T> findByPage();
	
	//查询所有的相关操作
	public List<T> findAll(Map map);
	
	//查询一个操作
	public T findOne(Serializable id);
	
	//删除操作
	public void deleteById(Serializable id);
	
	//更新操作
	public void update(T t);
	
	//插入操作
	public void insert(T t);
	
	//查询总的记录数据
	public Long count();

}
