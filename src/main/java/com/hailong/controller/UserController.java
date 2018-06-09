package com.hailong.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.hailong.entity.User;
import com.hailong.service.UserService;


@RestController
@RequestMapping("/System")
public class UserController {
	
	@Autowired
	private UserService userSerivce;
	
	@RequestMapping(value="/login.action",method = RequestMethod.POST)
	public String login(@RequestBody User user){
		System.out.println("Vue调用我们的Spring Boot的后台项目:"+user.getName()+"::"+user.getPassword());
		
		//进行相关数据的校验规则
		return null;
	}

	@RequestMapping(value="/registerUser.action")
	public String register(@RequestBody User user,HttpServletRequest request){
		
		boolean isMult=ServletFileUpload.isMultipartContent(request);
		System.out.println("结果为:"+isMult);
		System.out.println("Vue调用我们的Spring Boot的后台项目:"+user.getName()+"::"+user.getPassword());
		try{
			//userSerivce.insert(user);
		}catch(Exception e){
			return "error";
		}
		return "success";
	}
	

}
