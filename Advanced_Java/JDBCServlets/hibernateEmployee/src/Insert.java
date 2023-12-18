import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Insert {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();
       
        
        Session session=factory.getCurrentSession();
        Employee tempemployee=new Employee("Renuka",60000,"Hyderabad");
        System.out.println("Employee object created");
        
        session.beginTransaction();
        System.out.println("Transaction has begun");
        
       session.save(tempemployee);
        System.out.println("Saving the object");
        
        session.getTransaction().commit();
        System.out.println("Employee object is saved");
	}
}
