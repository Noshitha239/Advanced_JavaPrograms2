import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();

		Session session=factory.getCurrentSession();
	

		session.beginTransaction();
		System.out.println("Transaction has begun");

	    Student tempStudent=(Student) session.get(Student.class,4);
	    tempStudent.setFirstName("Renuka");
	    tempStudent.setEmail("renuka@gmail.com");
	    
	    

		session.getTransaction().commit();
		System.out.println("Updated successfully");
		
	}  

}
