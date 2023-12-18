import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="student1")
public class student1 {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="first_name")
	private String first_name;
	@Column(name="last_name")
	private String last_name;
	@Column(name="email")
	private String email;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="student_detail_id")
	private studentDetail studentDetail;

	public student1( String first_name, String last_name, String email) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;

	}

	public student1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public studentDetail getStudentDetail() {
		return studentDetail;
	}
	public void setStudentDetail(studentDetail studentDetail) {
		this.studentDetail = studentDetail;
	}
	@Override
	public String toString() {
		return "student1 [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", email=" + email
				+ ", student_detail_id=" + "]";
	}
}
