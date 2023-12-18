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
@Table(name="Employee")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="salary")
	private int salary;
	@Column(name="address")
	private String address;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="employee_detail_id")
	private employeeDetail employeeDetail;
    

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, int salary, String address) {
		super();
		
		this.name = name;
		this.salary = salary;
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public employeeDetail getEmployeeDetail() {
		return employeeDetail;
	}

	public void setEmployeeDetail(employeeDetail employeeDetail) {
		this.employeeDetail = employeeDetail;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address
				+ ", employeeDetail=" + employeeDetail + "]";
	}
 
}
