  package com.gqt.spring;

public class JavaTrainer implements Trainer{

	String name;
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
