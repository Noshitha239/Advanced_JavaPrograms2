package com.gqt.spring;

import org.springframework.stereotype.Component;

@Component("football")
public class FootballCoach implements Coach{

	@Override
	public String getDailyPractise() {
		// TODO Auto-generated method stub
		return "Football coach";
	}

}
