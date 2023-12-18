import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class InsertInstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(student1.class)
				.addAnnotatedClass(studentDetail.class)
				.addAnnotatedClass(Course.class)
				.addAnnotatedClass(review.class).addAnnotatedClass(Instructor.class).buildSessionFactory();
		Session session=factory.getCurrentSession();

		session.beginTransaction();

		Instructor tempInstructor =new Instructor("Navya", "V","vnavya@gmail.com");
		session.save(tempInstructor);

		session.getTransaction().commit();



	}

}
