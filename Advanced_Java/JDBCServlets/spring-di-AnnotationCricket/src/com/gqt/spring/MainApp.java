package com.gqt.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ClassPathXmlApplicationContext cpx= new ClassPathXmlApplicationContext("config.xml");
       
       CricketCoach cc= (CricketCoach) cpx.getBean("cricket");
       CricketCoach cc1= (CricketCoach) cpx.getBean("cricket");
       System.out.println(cc);
       System.out.println(cc1);
       
       FootballCoach fc=(FootballCoach) cpx.getBean("football");
       FootballCoach fc1=(FootballCoach) cpx.getBean("football");
       System.out.println(fc);
       System.out.println(fc1);
       
       HockeyCoach hc=(HockeyCoach) cpx.getBean("hockey");
       HockeyCoach hc1=(HockeyCoach) cpx.getBean("hockey");
       System.out.println(hc);
       System.out.println(hc1);
       
       
       
        
	}

}
