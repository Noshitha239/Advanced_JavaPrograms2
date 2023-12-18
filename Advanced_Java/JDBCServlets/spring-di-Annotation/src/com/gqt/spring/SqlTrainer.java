package com.gqt.spring;

import org.springframework.stereotype.Component;

@Component("sql")
public class SqlTrainer implements Trainer{

	@Override
	public String getPractise() {
		// TODO Auto-generated method stub
		return "Teaches queries";
	}

}