package com.rahul.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {
	
	private String courseCodePrefix;
	
	@Override
	public void initialize(CourseCode code) {
		courseCodePrefix = code.value();
	}

	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext arg1) {
		if(null != theCode) {
			return theCode.startsWith(courseCodePrefix);
		}
		return false;
	}


}
