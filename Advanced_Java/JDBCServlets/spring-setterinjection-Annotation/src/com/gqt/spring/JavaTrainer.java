package com.gqt.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("java")
public class JavaTrainer implements Trainer{
    
	@Value("Ramu")
	String name;
	@Value("12")
	int exp;
	@Override
	public String getPractise() {
		// TODO Auto-generated method stub
		return "Trains Java.";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getExp() {
		return exp;
	}
	public void setExp(int exp) {
		this.exp = exp;
	}

}
