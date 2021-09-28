package com.ss.phase3project.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlers {
	
	@ExceptionHandler (value = Exception.class)
	public String exceptionHandler() {
		return "exceptionHandler";
	}
}
