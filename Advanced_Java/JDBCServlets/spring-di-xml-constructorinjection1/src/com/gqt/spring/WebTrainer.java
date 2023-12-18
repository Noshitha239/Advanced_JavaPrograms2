package com.gqt.spring;

public class WebTrainer implements Trainer{

	String name;
	int exp;
	@Override
	public String getPractise() {
		// TODO Auto-generated method stub
		return "Teaches web technologies";
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
	public WebTrainer(String name, int exp) {
		super();
		this.name = name;
		this.exp = exp;
	}
	
	
}
