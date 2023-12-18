package com.gqt.spring;

import org.springframework.stereotype.Component;

@Component("java")
public class JavaTrainer implements Trainer{

	@Override
	public String getPractise() {
		// TODO Auto-generated method stub
		return "Trains Java.";
	}
	

}
