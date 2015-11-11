package com.practice.project.service;

import com.practice.project.model.RegisterAll;
import com.practice.project.model.STAT;
import com.practice.project.model.UserAuth;

public interface AuthService {

	
    public STAT addregisterUser(RegisterAll registerall);
	
	public STAT modifyloginUser(UserAuth userauth);
	
	public STAT modifylogoutUser(UserAuth userauth);
	
	
}
