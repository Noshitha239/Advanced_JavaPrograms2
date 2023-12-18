package com.gqt.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ClassPathXmlApplicationContext cpx=new ClassPathXmlApplicationContext("config.xml");
        JavaTrainer jt=(JavaTrainer) cpx.getBean("java");
        System.out.println(jt);
        System.out.println(jt.name);
        System.out.println(jt.exp);
	}
}
