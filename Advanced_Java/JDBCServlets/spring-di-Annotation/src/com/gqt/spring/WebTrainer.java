package com.gqt.spring;

import org.springframework.stereotype.Component;

@Component("web")
public class WebTrainer implements Trainer{

	@Override
	public String getPractise() {
		// TODO Auto-generated method stub
		return "Teaches web technologies";
	}
	
}
