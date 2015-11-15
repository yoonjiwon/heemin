package com.practice.project.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.practice.project.dao.AuthGetDao;
import com.practice.project.exception.CustomException;




public class CommonInterceptor implements HandlerInterceptor  {

	@Autowired
	AuthGetDao mapper;

 @Override
 public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object Obj) throws Exception {

  // TODO Auto-generated method stub
	 String id = request.getHeader("id");

	  
	  if(id!=null&&id.length()>0){

	   System.out.println("id가 있습니다.");
	   
	   String state = mapper.sessionCheck(id);

	   if(state.equals("OFF")){
		   throw new CustomException("login 상태가 아닙니다.");
	   }
	  }

	  else if(id==null||id.length()==0){

	   System.out.println("id가 없습니다!");

	   throw new CustomException("id가 없습니다.");

	  }


  

  return true;

 }

 @Override

 public void postHandle(HttpServletRequest request, HttpServletResponse response, Object Obj, ModelAndView mv)

   throws Exception {

  // TODO Auto-generated method stub

  System.out.println("posthandle");

  

 }

 @Override

 public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object Obj, Exception ex)

   throws Exception {

  // TODO Auto-generated method stub

  

 }


}


