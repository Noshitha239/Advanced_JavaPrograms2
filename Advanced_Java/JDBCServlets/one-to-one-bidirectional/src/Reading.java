import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Reading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(student1.class).addAnnotatedClass(studentDetail.class).buildSessionFactory();

		Session session=factory.getCurrentSession();
	
		session.beginTransaction();
		System.out.println("Transaction has begin");

		List<student1> l = session.createQuery("from student1").list();
		List<studentDetail> l1 = session.createQuery("from studentDetail").list();//Student is the class name
		System.out.println("Student details are: ");
		for(studentDetail tempstudentDetail : l1) {
			System.out.println(tempstudentDetail);
		}
		for(student1 tempstudent : l) {
			System.out.println(tempstudent);
		}
		session.getTransaction().commit();
	}
}
