package com.gqt.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ClassPathXmlApplicationContext cpx=new ClassPathXmlApplicationContext("config.xml");
        JavaTrainer jt=(JavaTrainer) cpx.getBean("java");
        jt.customStart();
        cpx.close();
//        JavaTrainer jt1=(JavaTrainer) cpx.getBean("java");
//        jt1.customStart();
	}

}
