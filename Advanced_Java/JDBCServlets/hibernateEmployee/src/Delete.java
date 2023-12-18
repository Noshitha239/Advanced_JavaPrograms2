import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();
	        
	        Session session=factory.getCurrentSession();
	      
	        session.beginTransaction();
	        System.out.println("Transaction has begun");
	        
	        Employee tempEmployee=(Employee) session.get(Employee.class,3);
	        session.delete(tempEmployee);
		    
			session.getTransaction().commit();
			System.out.println("Deleted successfully");
		    
		
	}

}
