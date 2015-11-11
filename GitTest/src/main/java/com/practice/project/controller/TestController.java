package com.practice.project.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.practice.project.model.Name;
import com.practice.project.model.STAT;
import com.practice.project.model.User;
import com.practice.project.model.UserList;
import com.practice.project.service.LogicService;

@RestController
public class TestController {
	
	@Autowired
	LogicService testservice;
	
	@RequestMapping(value = "/test/rest", method = RequestMethod.GET)
	public Name getName(HttpServletRequest request, HttpServletResponse response, @RequestParam(value="name") String name)
	{
		Name rt = testservice.getName(name);
		return rt;
		
	}
	
	@RequestMapping(value = "/service/user", method = RequestMethod.GET)
	public User getUser(HttpServletRequest request, HttpServletResponse response, @RequestParam(value="userID") String userID)
	{
		User rt = testservice.getUser(userID);
		return rt;
		
	}
	
	@RequestMapping(value = "/service/adduser", method = RequestMethod.POST)
	public STAT addUser(HttpServletRequest request, HttpServletResponse response, @RequestBody User user)
	{
		STAT stat = new STAT();
		stat = testservice.addUser(user);
		return stat;
		
	}
	
	@RequestMapping(value = "/service/modifyuser", method = RequestMethod.PUT)
	public STAT modifyUser(HttpServletRequest request, HttpServletResponse response, @RequestBody User user)
	{
		STAT stat = new STAT();
		stat = testservice.modifyUser(user);
		return stat;
		
	}
	
	@RequestMapping(value = "/service/removeuser", method = RequestMethod.DELETE)
	public STAT removeUser(HttpServletRequest request, HttpServletResponse response, @RequestParam(value="userID") String userID)
	{
		STAT stat = new STAT();
		stat = testservice.removeUser(userID);
		return stat;
		
	}
	
	@RequestMapping(value = "/service/userlist", method = RequestMethod.GET)
	 public UserList getUserList(HttpServletRequest request, HttpServletResponse response) 
	{
		UserList userlist = new UserList();
		userlist = testservice.getUserList();
		return userlist;
	}

}
