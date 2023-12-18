	import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 SessionFactory factory=new Configuration().configure("hibernate.cfg.xml")
				 .addAnnotatedClass(student1.class)
				 .addAnnotatedClass(studentDetail.class)
				 .addAnnotatedClass(Course.class).buildSessionFactory();
	     Session session=factory.getCurrentSession();
	     
	     session.beginTransaction();
	     
	     Course course1 = new Course("Java");
	     Course course2 = new Course("Python");
	     Course course3 = new Course("MySQL");
	     
	     student1 tempStudent = (student1) session.get(student1.class,1);
	     System.out.println(tempStudent);
	     tempStudent.addCourse(course1);
	     tempStudent.addCourse(course2);
	     tempStudent.addCourse(course3);
	     
	     session.save(course1);
	     session.save(course2);
	     session.save(course3);
	     
	     session.getTransaction().commit();
	     
	     
	     
	}

}
