import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).addAnnotatedClass(employeeDetail.class).buildSessionFactory();
	     Session session=factory.getCurrentSession();
	     
	     session.beginTransaction();
	     
	     Employee tempEmployee=(Employee) session.get(Employee.class,2);
		 session.delete(tempEmployee);
		 
	     session.getTransaction().commit();
	}

}
