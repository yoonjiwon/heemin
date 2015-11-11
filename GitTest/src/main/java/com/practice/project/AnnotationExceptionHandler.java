package com.practice.project;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import com.practice.project.model.STAT;

@RestController
@ControllerAdvice
public class AnnotationExceptionHandler {

	
	@ExceptionHandler(Exception.class)
	public STAT handleException(Exception e){
		STAT stat = new STAT();
		stat.setStat("fail");
		stat.setCause(e.getMessage());
		return stat;
	}
		
}
