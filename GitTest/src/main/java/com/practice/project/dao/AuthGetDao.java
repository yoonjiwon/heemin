package com.practice.project.dao;

import com.practice.project.model.User;
import com.practice.project.model.UserAuth;

public interface AuthGetDao {


	public void addregisterUser(UserAuth userauth);
	
	public void addUser(User user);
	
	public String selectUserlogCheck(UserAuth userauth);
	
	public void modifyloginUser(UserAuth userauth);
	
	public void modifylogoutUser(UserAuth userauth);
	
	public String sessionCheck(String id);
	
	
}
