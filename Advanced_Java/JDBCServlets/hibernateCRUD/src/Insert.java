import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
       
        
        Session session=factory.getCurrentSession();
        Student tempstudent=new Student("Noshitha","N","Vnoshitha@gmail.com");
        System.out.println("Student object created");
        
        session.beginTransaction();
        System.out.println("Transaction has begun");
        
       session.save(tempstudent);
        System.out.println("Saving the object");
        
        session.getTransaction().commit();
        System.out.println("Student object is saved");
	}

}
