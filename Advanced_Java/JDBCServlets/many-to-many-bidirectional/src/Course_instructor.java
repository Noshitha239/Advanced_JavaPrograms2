import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="course_instructor")
public class Course_instructor {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int course_id;
	private int instructor_id;
	public Course_instructor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course_instructor(int course_id, int instructor_id) {
		super();
		this.course_id = course_id;
		this.instructor_id = instructor_id;
	}
	public int getCourse_id() {
		return course_id;
	}
	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}
	public int getInstructor_id() {
		return instructor_id;
	}
	public void setInstructor_id(int instructor_id) {
		this.instructor_id = instructor_id;
	}
	@Override
	public String toString() {
		return "Course_instructor [course_id=" + course_id + ", instructor_id=" + instructor_id + "]";
	}

}
