package com.practice.project.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.practice.project.model.Name;
import com.practice.project.model.Person;
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
	
	@RequestMapping(value = "/service/getuser", method = RequestMethod.GET)
	public User getUser(HttpServletRequest request, HttpServletResponse response, @RequestParam(value="userID") String userID)
	{
		User rt = testservice.getUser(userID);
		return rt;
		
	}
	
	/*@RequestMapping(value = "/service/adduser", method = RequestMethod.POST)
	public STAT addUser(HttpServletRequest request, HttpServletResponse response, @RequestBody User user)
	{
		System.out.println(user.getUserID()+user.getUserName()+user.getUserAge()+user.getPhone()+user.getComment());
		STAT stat = new STAT();
		stat = testservice.addUser(user);
		return stat;
		
	}*/

	
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
	
	
	/*
	
	@RequestMapping(value = "/restothertest", method = RequestMethod.GET)
	@ResponseBody
	public Person restOtherTest() {
		//System.out.println("�뀒�뒪�듃 以묒엯�땲�떎. restothertest");
		Person ex1 = new Person();
		ex1.setAge("1");
		ex1.setCompany("othercom");
		ex1.setId("google");
		ex1.setName("back");
		ex1.setPhone("none");
		return ex1;
	}
	
	@RequestMapping(value = "/parametertest", method = RequestMethod.GET)
	@ResponseBody
	public Person PameterTest(@RequestParam(value="name")String name){
		Person ex1 = new Person();
		ex1.setAge("1");
		ex1.setCompany("othercom");
		ex1.setId("google");
		ex1.setName(name);
		ex1.setPhone("none");
		return ex1;
		
	}
	
	@RequestMapping(value = "/posttest", method = RequestMethod.POST)
	@ResponseBody
	public Person postTest(@RequestBody Person person){
		Person ex1 = new Person();
		ex1.setAge(person.getAge());
		ex1.setCompany(person.getCompany());
		ex1.setId(person.getId());
		ex1.setName(person.getName());
		ex1.setPhone(person.getName());
		return ex1;
		
	}

	@RequestMapping(value = "/puttest", method = RequestMethod.PUT)
	@ResponseBody
	public Person putTest(@RequestBody Person person){
		Person ex1 = new Person();
		ex1.setAge(person.getAge());
		ex1.setCompany(person.getCompany());
		ex1.setId(person.getId());
		ex1.setName(person.getName());
		ex1.setPhone(person.getName());
		return ex1;
		
	}
	//headertest
	@RequestMapping(value = "/headertest", method = RequestMethod.GET)
	@ResponseBody
	public Person headerTest(HttpServletRequest request
			, HttpServletResponse response){
		Person ex1 = new Person();
		ex1.setAge("50");
		ex1.setCompany("none");
		ex1.setId(request.getHeader("id"));
		ex1.setName(request.getHeader("name"));
		ex1.setPhone("none");
		return ex1;
		
	}
	//multitest
	@RequestMapping(value = "/multitest", method = RequestMethod.GET)
	@ResponseBody
	public Person MultiTest(HttpServletRequest request
			, HttpServletResponse response,@RequestParam(value="name")String name){
		Person ex1 = new Person();
		ex1.setAge("50");
		ex1.setCompany("none");
		ex1.setId(request.getHeader("id"));
		ex1.setName(name);
		ex1.setPhone("none");
		return ex1;
		
	}
	
	
	//multipersontest
		@RequestMapping(value = "/multipersontest", method = RequestMethod.GET)
		@ResponseBody
		public List<Person> MultiPersonTest(HttpServletRequest request
				, HttpServletResponse response,@RequestParam(value="name")String name){
			Person ex1 = new Person();
			ex1.setAge("50");
			ex1.setCompany("none");
			ex1.setId(request.getHeader("id"));
			ex1.setName(name);
			ex1.setPhone("none");
			
			Person ex2 = new Person();
			ex2.setAge("51");
			ex2.setCompany("MS");
			ex2.setId(request.getHeader("id"));
			ex2.setName(name);
			ex2.setPhone("010...");
			
			List<Person> list = new ArrayList<Person>();
			list.add(ex1);
			list.add(ex2);
			return list;
			
		}

*/
}
