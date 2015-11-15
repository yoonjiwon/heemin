package com.practice.project.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.project.dao.AuthGetDao;
import com.practice.project.exception.CustomException;
import com.practice.project.model.RegisterAll;
import com.practice.project.model.STAT;
import com.practice.project.model.User;
import com.practice.project.model.UserAuth;
import com.practice.project.service.AuthService;

@Service
public class AuthServiceimpl implements AuthService {
	
	@Autowired
	private AuthGetDao mapper;
	
	
	@Override
	public STAT addregisterUser(RegisterAll registerall) {
		// TODO Auto-generated method stub

		STAT stat = new STAT();
		
		UserAuth userauth = new UserAuth();
		userauth.setId(registerall.getId());
		userauth.setPassword(registerall.getPassword());
		
		User user = new User();
		user.setUserID(registerall.getId());
		user.setUserName(registerall.getUserName());
		user.setUserAge(registerall.getUserAge());
		user.setPhone(registerall.getPhone());
		user.setComment(registerall.getComment());
		
		mapper.addregisterUser(userauth);
		mapper.addUser(user);
		stat.setStat("success");
		
		return stat;
	}

	@Override
	public STAT modifyloginUser(UserAuth userauth) {
		// TODO Auto-generated method stub

		STAT stat = new STAT();
		
		String check = mapper.selectUserlogCheck(userauth);
		if(check.equals("1")){
		mapper.modifyloginUser(userauth);
		stat.setStat("success");
		}else{
			throw new CustomException("id나 password가 일치하지 않습니다.");
		}
		
		return stat;
	}

	@Override
	public STAT modifylogoutUser(UserAuth userauth) {
		// TODO Auto-generated method stub
		STAT stat = new STAT();
		
		String check = mapper.selectUserlogCheck(userauth);
		if(check.equals("1")){
		mapper.modifylogoutUser(userauth);
		stat.setStat("success");
		}else{
			throw new CustomException("�̻��մϴ�!");
		}
		return stat;
	}

}
