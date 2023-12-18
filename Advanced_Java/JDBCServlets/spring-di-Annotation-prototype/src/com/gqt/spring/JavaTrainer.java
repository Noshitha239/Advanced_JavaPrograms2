package com.gqt.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("java")
@Scope("prototype")
public class JavaTrainer implements Trainer{

	@Override
	public String getPractise() {
		// TODO Auto-generated method stub
		return "Trains Java.";
	}
	

}
