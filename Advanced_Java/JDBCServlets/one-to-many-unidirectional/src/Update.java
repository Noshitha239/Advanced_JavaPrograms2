import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(student1.class).addAnnotatedClass(studentDetail.class).buildSessionFactory();
	     Session session=factory.getCurrentSession();
	     
	     session.beginTransaction();
	     
	     student1 tempStudent=(student1) session.get(student1.class,1);
		    tempStudent.setLast_name("Vithanal");
		    tempStudent.setEmail("vnoshi@gmail.com");
		   
	   
	     session.getTransaction().commit();
	     System.out.println("Updated successfully");
	}

}
