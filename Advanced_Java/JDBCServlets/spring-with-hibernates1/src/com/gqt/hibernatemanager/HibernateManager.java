package com.gqt.hibernatemanager;

import java.util.ArrayList;
import java.util.List;



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
	public int updatePassword(String id,String name,String newPassword) {
		// TODO Auto-generated method stub
		try {
			int tempId=Integer.parseInt(id);
			session.beginTransaction();
			Customer c1 = (Customer) session.get(Customer.class,tempId);
			c1.setPassword(newPassword);	
			session.getTransaction().commit();
			return 1;
		}
		catch(Exception e) {
			e.printStackTrace();
			return 0;
		}		
	}
}







