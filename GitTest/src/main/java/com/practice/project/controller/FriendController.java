package com.practice.project.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.practice.project.model.FriendList;
import com.practice.project.model.FriendUser;
import com.practice.project.model.STAT;
import com.practice.project.model.UserList;
import com.practice.project.service.LogicService;

@RestController
public class FriendController {

	@Autowired
	LogicService logicservice;
	
	@RequestMapping(value = "/friend/frienduser", method = RequestMethod.POST)
	public STAT addfriendUser(HttpServletRequest request, HttpServletResponse response, @RequestBody FriendUser frienduser)
	{
		STAT stat = logicservice.addfriendUser(frienduser);
		return stat;
		
	}
	
	@RequestMapping(value = "/friend/friendsearch", method = RequestMethod.GET)
	public FriendList addfriendSearch(HttpServletRequest request, HttpServletResponse response, @RequestParam(value="id") String id)
	{
		FriendList friendlist = new FriendList();
		friendlist = logicservice.getfriendSearch(id);
		return friendlist;
		
	}
}
