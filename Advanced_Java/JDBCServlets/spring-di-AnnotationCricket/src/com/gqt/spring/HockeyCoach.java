package com.gqt.spring;

import org.springframework.stereotype.Component;

@Component("hockey")
public class HockeyCoach implements Coach{

	@Override
	public String getDailyPractise() {
		// TODO Auto-generated method stub
		return "Hockey Coach";
	}

}
