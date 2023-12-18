package com.gqt.hibernateMavenEmployeeCrud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        SessionFactory factory= new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();
        
        Session session = factory.getCurrentSession();
        Employee tempEmployee= new Employee("Noshitha",60000,"vnoshitha@gmail.com");
        System.out.println("Employee object created");
        
        session.beginTransaction();
        System.out.println("Transaction begin.");
        
        session.save(tempEmployee);
        System.out.println("object saved");
        
        
        session.getTransaction().commit();
        System.out.println("Employee Deatails added");
        
        
	}

}
