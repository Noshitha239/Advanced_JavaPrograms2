package com.gqt.hibernatemanager;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.gqt.entity.Customer;

public class HibernateManager {

	// TODO Auto-generated method stub
	SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Customer.class).buildSessionFactory();
	Session session=(Session) factory.getCurrentSession();
	public int register(String name, String password) {
		session.beginTransaction();
		Customer tempCustomer=new Customer(name,password);
		session.save(tempCustomer);
		session.getTransaction().commit();
		return 0;
	}
	public int login(String name, String password) {
		try {
			session.beginTransaction();
			List<Customer> customers = (ArrayList<Customer>)session.createQuery("FROM Customer").list();
			for (Customer customer : customers) {
				if (customer.getName().equals(name) && customer.getPassword().equals(password)) {
					session.getTransaction().commit();
					return 1; // Match found, login successful
				}
			}
			session.getTransaction().commit();
			return 0;
		}
		catch(Exception e) {
			session.getTransaction().commit();
			return 0; 
		}
	}
	public int updateName(String name) {

		session.beginTransaction();
		Customer c = (Customer) session.get(Customer.class,1);
		c.setName(name);	
		session.getTransaction().commit();
		return 1;
	}
	public int updatePassword(String password) {
		// TODO Auto-generated method stub
		session.beginTransaction();
		Customer c1 = (Customer) session.get(Customer.class,5);
		c1.setPassword(password);	
		session.getTransaction().commit();
		return 1;
		
	}

}






