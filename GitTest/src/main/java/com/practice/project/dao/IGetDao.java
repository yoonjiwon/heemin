package com.practice.project.dao;

import java.util.List;

import com.practice.project.model.FriendUser;
import com.practice.project.model.Name;
import com.practice.project.model.User;
import com.practice.project.model.UserAuth;

public interface IGetDao {

	public Name selectName(String name);
	
	public User selectUser(String userID);
	
	//public void addUser(User user);
	
	public void modifyUser(User user);
	
	public void removeUser(String userID);
	
	public List<User> getUserList();
	
	public void addfriendUser(FriendUser frienduser);
	
	public List<User> getfriendSearch(String userID);


}
