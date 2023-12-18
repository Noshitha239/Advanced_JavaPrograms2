import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(student1.class).addAnnotatedClass(studentDetail.class).buildSessionFactory();
	     Session session=factory.getCurrentSession();
	     
	     session.beginTransaction();
	     
	     student1 tempStudent = new student1("Noshitha","V","vnoshitha@gmail.com"); 
	     studentDetail tempstudentDetail = new studentDetail("cse","Dancing");
	     
	     tempStudent.setStudentDetail(tempstudentDetail);
	     tempstudentDetail.setStudent1(tempStudent);
	    
	     session.save(tempStudent);
	     session.getTransaction().commit();
	     
	}

}
