package com.practice.project.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"stat", "cause", "userList"})
public class UserList {
	
	@JsonProperty("stat")
	@JsonInclude(Include.NON_NULL)
	private String stat;
	
	@JsonProperty("userList")
	@JsonInclude(Include.ALWAYS)
	private List<User> userList;

	public String getStat() {
		return stat;
	}

	public void setStat(String stat) {
		this.stat = stat;
	}

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}
	
	

}
