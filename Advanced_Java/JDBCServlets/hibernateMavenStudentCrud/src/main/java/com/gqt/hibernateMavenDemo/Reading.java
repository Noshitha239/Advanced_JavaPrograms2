package com.gqt.hibernateMavenDemo;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Reading {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();

		Session session=factory.getCurrentSession();
	

		session.beginTransaction();
		System.out.println("Transaction has begun");

		List<Student> l=session.createQuery("from Student").list();//Student is the class name
		System.out.println("Student details are: +");
		for(Student tempstudent : l) {
			System.out.println(tempstudent);
		}

		session.getTransaction().commit();
		
	}
}
