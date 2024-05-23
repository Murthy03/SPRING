package murthy;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeMapper implements RowMapper<Employee> {

	public Employee mapRow(ResultSet resultSet, int i) throws SQLException {
		Employee emp = new Employee();
		emp.setEmp_no(resultSet.getInt("emp_no"));
		emp.setEmp_name(resultSet.getString("emp_name"));
		emp.setJob(resultSet.getString("job"));
		emp.setSalary(resultSet.getDouble("salary"));
		emp.setDept_no(resultSet.getInt("dept_no"));
		emp.setHire_date(resultSet.getDate("hire_date"));
		return emp;
	}
}
