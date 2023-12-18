import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Reading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(student1.class)
				.addAnnotatedClass(studentDetail.class)
				.addAnnotatedClass(Course.class).addAnnotatedClass(review.class).buildSessionFactory();

		Session session=factory.getCurrentSession();

		session.beginTransaction();

		Course tempCourse = (Course) session.get(Course.class, 14);
		System.out.println("Course details are - ");
		System.out.println(tempCourse);

		List<review> tempReview = tempCourse.getReview();
		System.out.println("Reviews are - ");
		for(review x:tempReview) {
			System.out.println(x);
		}

		session.getTransaction().commit();
	}
}
