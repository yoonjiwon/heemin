package com.practice.project.authcontroller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.practice.project.model.FriendUser;
import com.practice.project.model.RegisterAll;
import com.practice.project.model.STAT;
import com.practice.project.model.UserAuth;
import com.practice.project.service.AuthService;

@RestController
public class SessionController {
	
	@Autowired
	AuthService authservice;

	@RequestMapping(value = "/auth/registeruser", method = RequestMethod.POST)
	public STAT addregisterUser(HttpServletRequest request, HttpServletResponse response, @RequestBody RegisterAll registerall)
	{
		STAT stat = authservice.addregisterUser(registerall);
		return stat;
		
	}
	
	@RequestMapping(value = "/auth/loginuser", method = RequestMethod.PUT)
	public STAT modifyloginUser(HttpServletRequest request, HttpServletResponse response, @RequestBody UserAuth userauth)
	{
		STAT stat = authservice.modifyloginUser(userauth);
		return stat;
		
	}
	
	@RequestMapping(value = "/auth/logoutuser", method = RequestMethod.PUT)
	public STAT modifylogoutUser(HttpServletRequest request, HttpServletResponse response, @RequestBody UserAuth userauth)
	{
		STAT stat = authservice.modifylogoutUser(userauth);
		return stat;
		
	}
	
	
}
