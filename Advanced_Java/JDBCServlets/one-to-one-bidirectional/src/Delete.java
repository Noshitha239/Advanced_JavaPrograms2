import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(student1.class).addAnnotatedClass(studentDetail.class).buildSessionFactory();
	     Session session=factory.getCurrentSession();
	     
	     session.beginTransaction();
	     
	     studentDetail tempStudent=(studentDetail) session.get(studentDetail.class,2);
		 session.delete(tempStudent);
		    
	     session.getTransaction().commit();
	     System.out.println("Deleted successfully");
	     
	}

}
