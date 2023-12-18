import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Reading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(student1.class).addAnnotatedClass(studentDetail.class).addAnnotatedClass(Course.class).buildSessionFactory();

		Session session=factory.getCurrentSession();

		session.beginTransaction();

		student1 tempStudent = (student1) session.get(student1.class, 1);
		System.out.println("Student Object is - ");
		System.out.println(tempStudent);

		List<Course> tempCourses = tempStudent.getCourse();
		System.out.println("Courses are - ");
		for(Course x:tempCourses) {
			System.out.println(x);
		}

		session.getTransaction().commit();
	}
}
