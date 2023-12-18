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
				.addAnnotatedClass(Course.class).addAnnotatedClass(review.class)
				.addAnnotatedClass(Instructor.class).buildSessionFactory();

		Session session=factory.getCurrentSession();

		session.beginTransaction();

		Instructor tempInstructor = (Instructor) session.get(Instructor.class, 1);
		System.out.println("Instructor details are - ");
		System.out.println(tempInstructor);
		
//		Course tempCourse = (Course) session.get(Course.class, 16);
//		System.out.println("Course details are: ");
//		System.out.println(tempCourse);
		
		List<Course> tempCourse = tempInstructor.getCourse();
		System.out.println("Course details are: ");
		for(Course x:tempCourse) {
			System.out.println(x);
		}
		
		session.getTransaction().commit();
	}
}
