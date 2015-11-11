package com.practice.project.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.project.dao.IGetDao;
import com.practice.project.model.FriendList;
import com.practice.project.model.FriendUser;
import com.practice.project.model.Name;
import com.practice.project.model.STAT;
import com.practice.project.model.User;
import com.practice.project.model.UserList;
import com.practice.project.service.LogicService;

@Service
public class LogicServiceimpl implements LogicService {

	@Autowired
	private IGetDao mapper;
	
	@Override
	public Name getName(String name) {
		// TODO Auto-generated method stub
		Name Testreturn = new Name();
		Testreturn = mapper.selectName(name);
		return Testreturn;
	}

	@Override
	public User getUser(String id) {
		// TODO Auto-generated method stub
		User user = new User();
		user = mapper.selectUser(id);
		return user;
	}

	@Override
	public STAT addUser(User user) {
		// TODO Auto-generated method stub
		
			STAT stat = new STAT();
			mapper.addUser(user);
			stat.setStat("success");
			return stat;
		
	}

	@Override
	public STAT modifyUser(User user) {
		// TODO Auto-generated method stub
			
			STAT stat = new STAT();
			mapper.modifyUser(user);
			stat.setStat("success");
			return stat;
		
	}

	@Override
	public STAT removeUser(String userID) {
		// TODO Auto-generated method stub
		
			STAT stat = new STAT();
			mapper.removeUser(userID);
			stat.setStat("success");
			return stat;
	}

	@Override
	public UserList getUserList() {
		// TODO Auto-generated method stub
		
			UserList userlist = new UserList();
			userlist.setUserList(mapper.getUserList());
			userlist.setStat("success");
			return userlist;
		
	}
	
	@Override
	public STAT addfriendUser(FriendUser frienduser) {
		// TODO Auto-generated method stub
		STAT stat = new STAT();
		mapper.addfriendUser(frienduser);
		stat.setStat("success");
		
		return stat;
	}

	@Override
	public FriendList getfriendSearch(String id) {
		// TODO Auto-generated method stub
		FriendList friendlist = new FriendList();
		friendlist.setFriendList(mapper.getfriendSearch(id));
		friendlist.setCount(friendlist.getFriendList().size()); //list row 수 세주기
		friendlist.setStat("success");
		return friendlist;
	}


}
