import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteInstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 SessionFactory factory=new Configuration().configure("hibernate.cfg.xml")
				 .addAnnotatedClass(student1.class)
				 .addAnnotatedClass(studentDetail.class)
				 .addAnnotatedClass(Course.class).addAnnotatedClass(review.class)
				 .addAnnotatedClass(Instructor.class)
				 .buildSessionFactory();
		 
	     Session session=factory.getCurrentSession();
	     
	     session.beginTransaction();
	     
	     Instructor tempInstructor=(Instructor) session.get(Instructor.class,2);
		 session.delete(tempInstructor);
		    
	     session.getTransaction().commit();
	    
	     
	}

}
