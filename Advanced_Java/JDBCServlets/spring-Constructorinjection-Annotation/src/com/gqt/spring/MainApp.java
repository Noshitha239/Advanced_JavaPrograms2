package com.gqt.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	private static Employee Bean;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ClassPathXmlApplicationContext cpx=new ClassPathXmlApplicationContext("config.xml");
        Bean=(Employee) cpx.getBean("employeeBean");
        System.out.println(Bean.getAddress());
	}
}
