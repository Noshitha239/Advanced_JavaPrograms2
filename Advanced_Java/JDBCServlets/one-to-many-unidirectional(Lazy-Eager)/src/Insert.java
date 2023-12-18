import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(student1.class)
				.addAnnotatedClass(studentDetail.class)
				.addAnnotatedClass(Course.class)
				.addAnnotatedClass(review.class).buildSessionFactory();
		Session session=factory.getCurrentSession();

		session.beginTransaction();

		Course tempCourse=new Course("English");
		
		review review1 = new review("good");
		review review2 = new review("nice");
		review review3 = new review("fantastic");

		session.save(tempCourse);
		
		tempCourse.addReview(review1);
		tempCourse.addReview(review2);
		tempCourse.addReview(review3);

		

		session.getTransaction().commit();



	}

}
