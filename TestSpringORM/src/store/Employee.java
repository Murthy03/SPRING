package store;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "nmurthy_emp")
@Entity
public class Employee {
	@Id
	private int emp_no;
	private String emp_name;
	private String job;
	private double salary;
	private int dept_no;
	private Date hire_date;

	public Employee() {
	}

	public Employee(int emp_no, String emp_name, String job, double salary, int dept_no, Date hire_date) {
		super();
		this.emp_no = emp_no;
		this.emp_name = emp_name;
		this.job = job;
		this.salary = salary;
		this.dept_no = dept_no;
		this.hire_date = hire_date;
	}

	public int getEmp_no() {
		return emp_no;
	}

	public void setEmp_no(int emp_no) {
		this.emp_no = emp_no;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getDept_no() {
		return dept_no;
	}

	public void setDept_no(int dept_no) {
		this.dept_no = dept_no;
	}

	public Date getHire_date() {
		return hire_date;
	}

	public void setHire_date(Date hire_date) {
		this.hire_date = hire_date;
	}

}
