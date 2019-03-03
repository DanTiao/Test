package com.cc.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cc.demo.pojo.UserData;

@RestController
public class TestController {
	
	@Autowired
	UserData userData;

	@RequestMapping("test")
	public UserData testLink(String user, String age, String id) {
		int ID = Integer.parseInt(id);
		int AGE = Integer.parseInt(age);
		userData.setID(ID);
		userData.setAge(AGE);
		userData.setName(user);
		
		return userData;
//		return username + "lalalalala";
	}
}
