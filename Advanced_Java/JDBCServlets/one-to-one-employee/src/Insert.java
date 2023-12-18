import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).addAnnotatedClass(employeeDetail.class).buildSessionFactory();
	     Session session=factory.getCurrentSession();
	     
	     session.beginTransaction();
	     
	     Employee tempemployee= new Employee("Noshitha",50000,"Bangalore");
	     employeeDetail tempEmployeeDetail=new employeeDetail("Developer","Software");
	     
	     tempemployee.setEmployeeDetail(tempEmployeeDetail);
		   
	     session.save(tempemployee);
	     session.getTransaction().commit();
	}

}
