import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();
	       
	        
	        Session session=factory.getCurrentSession();
	      
	        session.beginTransaction();
	        System.out.println("Transaction has begun");
	        
	        Employee tempEmployee=(Employee) session.get(Employee.class,3);
		    tempEmployee.setEmpName("Renuka V");
		    tempEmployee.setEmpSalary(20000);
		    
			session.getTransaction().commit();
			System.out.println("Updated successfully");
			
	}

}
