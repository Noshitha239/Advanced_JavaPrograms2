
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="course")
public class Course {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="title")
	private String title;
	@ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	@JoinColumn(name="student_id")
	private student1 student;
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="course_id")
	
	private List<review> review;
	public void addReview(review tempreview) {
		// TODO Auto-generated method stub
		if(review==null) {
			review = new ArrayList();
		}
		review.add(tempreview);
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(String title) {
		super();
		this.title = title;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public student1 getStudent() {
		return student;
	}
	public void setStudent(student1 student) {
		this.student = student;
	}
	
	public List<review> getReview() {
		return review;
	}
	public void setReview(List<review> review) {
		this.review = review;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", title=" + title + "]";
	}
	
	
}
