package com.gqt.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ApplicationContext cpx=new ClassPathXmlApplicationContext("config.xml");
       JdbcTemplate bean=(JdbcTemplate) cpx.getBean("jdbcTemplate");
       String s="insert into employee values(?,?,?)";
       int res=bean.update(s,1,"Navya","vnr");
       System.out.println(res);
	}
}
