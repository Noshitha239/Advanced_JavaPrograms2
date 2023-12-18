package com.gqt.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ClassPathXmlApplicationContext cpx=new ClassPathXmlApplicationContext("config.xml");
        JavaTrainer jt=(JavaTrainer) cpx.getBean("java");
        JavaTrainer jt1=(JavaTrainer) cpx.getBean("java");
        System.out.println(jt);
        System.out.println(jt.name);
        System.out.println(jt.exp);
        
        System.out.println(jt1);
        System.out.println(jt1.name);
        System.out.println(jt1.exp);
        
        WebTrainer wt=(WebTrainer) cpx.getBean("web");
        WebTrainer wt1=(WebTrainer) cpx.getBean("web");
        System.out.println(wt);
        System.out.println(wt1);
          
        SqlTrainer st=(SqlTrainer) cpx.getBean("sql");
        SqlTrainer st1=(SqlTrainer) cpx.getBean("sql");
        System.out.println(st);
        System.out.println(st1);
        
	} 
}
