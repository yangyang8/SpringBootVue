package com.hailong.controller.role;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONArray;
import com.hailong.controller.User;
import com.hailong.controller.User2;

/**
 * api规犯如下
 * 查询列表 ==> post请求 => role/pageRoleList.action
 * @author Administrator
 *
 */

@RestController
@RequestMapping("/role")
public class SystemRoleController {
	
	@RequestMapping("/pageRoleList.action")
	public String pageRoleList(){
		System.out.println("查询数据库得到所有的权限数据...");
		List<User2> list=new ArrayList<User2>();
		list.add(new User2("杨杨1",43,"1234561"));
		list.add(new User2("杨杨2",56,"1234562"));
		list.add(new User2("杨杨3",46,"1234563"));
		list.add(new User2("杨杨4",26,"1234564"));
		list.add(new User2("杨杨5",52,"1234565"));
		
		String json=JSONArray.toJSONString(list);
		
		return json;
	}

}
