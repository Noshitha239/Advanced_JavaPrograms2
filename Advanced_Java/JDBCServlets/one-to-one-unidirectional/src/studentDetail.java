import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="student_detail")
public class studentDetail {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="branch")
	private String branch;
	@Column(name="hobby")
	private String hobby;
	
	public studentDetail() {
		super();
		// TODO Auto-generated constructor stub
	}

	public studentDetail(String branch, String hobby) {
		super();
		this.branch = branch;
		this.hobby = hobby;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	@Override
	public String toString() {
		return "studentDetail [id=" + id + ", branch=" + branch + ", hobby=" + hobby + "]";
	}

}
