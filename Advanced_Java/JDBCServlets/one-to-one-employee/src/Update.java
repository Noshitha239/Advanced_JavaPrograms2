import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).addAnnotatedClass(employeeDetail.class).buildSessionFactory();
		Session session=factory.getCurrentSession();

		session.beginTransaction();
		Employee tempEmployee=(Employee) session.get(Employee.class,1);
		
		tempEmployee.setName("Vnnr");
		tempEmployee.setSalary(40000);

		session.getTransaction().commit();
	}

}
