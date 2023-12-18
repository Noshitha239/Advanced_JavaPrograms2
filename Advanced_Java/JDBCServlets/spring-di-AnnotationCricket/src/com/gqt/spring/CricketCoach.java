package com.gqt.spring;

import org.springframework.stereotype.Component;

@Component("cricket")
public class CricketCoach implements Coach{

	@Override
	public String getDailyPractise() {
		// TODO Auto-generated method stub
		return "CrickCoach";
	}

}
