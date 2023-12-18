package com.gqt.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ClassPathXmlApplicationContext cpx=new ClassPathXmlApplicationContext("config.xml");
        
        Employee e=(Employee) cpx.getBean("emp");
        System.out.println(e.getId());
        System.out.println(e.getName());
        System.out.println(e);
	}

}
