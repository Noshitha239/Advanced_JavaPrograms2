package com.gqt.hibernateMavenEmployeeCrud;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



public class Reading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();

		Session session=factory.getCurrentSession();
	

		session.beginTransaction();
		System.out.println("Transaction has begun");

		List<Employee> l=session.createQuery("from Employee").list();//Student is the class name
		System.out.println("Student details are: ");
		for(Employee tempemployee : l) {
			System.out.println(tempemployee);
		}

		session.getTransaction().commit();
	}

}
