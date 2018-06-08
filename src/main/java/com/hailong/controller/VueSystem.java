package com.hailong.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONArray;

@RestController
@RequestMapping("/System")
public class VueSystem {
	
	/**
	 * password
	 * userName
	 * @param user
	 * @return
	 */
	//方式一
/*	@RequestMapping(value="/login.action",method = RequestMethod.POST)
	public String login(@RequestBody String username){
		System.out.println("Vue调用我们的Spring Boot的后台项目:"+username);
		return "UserLogin";
	}*/
	
	//方式二
	/*@RequestMapping(value="/login.action",method = RequestMethod.POST)
	public String login(@RequestBody Map<String,String> map){
		System.out.println("Vue调用我们的Spring Boot的后台项目:"+map.get("username"));
		return "UserLogin";
	}*/
	
	@RequestMapping(value="/login.action",method = RequestMethod.POST)
	public String login(@RequestBody User user){
		System.out.println("Vue调用我们的Spring Boot的后台项目:"+user.getUser()+"::"+user.getPassword());
		List<User> list=new ArrayList<User>();
		list.add(new User("杨杨1","1234561"));
		list.add(new User("杨杨2","1234562"));
		list.add(new User("杨杨3","1234563"));
		list.add(new User("杨杨4","1234564"));
		list.add(new User("杨杨5","1234565"));
		
		String json=JSONArray.toJSONString(list);
		
		return json;
	}
	
	@RequestMapping(value="/login.action",method = RequestMethod.GET)
	public String login2(User user){
		System.out.println("Vue调用我们的Spring Boot的后台项目:"+user.getUser()+"::"+user.getPassword());
		List<User> list=new ArrayList<User>();
		list.add(new User("杨杨1","1234561"));
		list.add(new User("杨杨2","1234562"));
		list.add(new User("杨杨3","1234563"));
		list.add(new User("杨杨4","1234564"));
		list.add(new User("杨杨5","1234565"));
		
		String json=JSONArray.toJSONString(list);
		
		return json;
	}
}
