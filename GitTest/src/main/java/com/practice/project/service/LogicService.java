package com.practice.project.service;

import com.practice.project.model.FriendList;
import com.practice.project.model.FriendUser;
import com.practice.project.model.Name;
import com.practice.project.model.STAT;
import com.practice.project.model.User;
import com.practice.project.model.UserList;

public interface LogicService {

	public Name getName(String name);
	
	public User getUser(String id);
	
	public STAT addUser(User user);
	
	public STAT modifyUser(User user);
	
	public STAT removeUser(String userID);
	
	public UserList getUserList();
	
	public STAT addfriendUser(FriendUser frienduser);
	
	public FriendList getfriendSearch(String id);
}
