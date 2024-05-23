package murthy;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class EmpDAO {
	JdbcTemplate jdbcTemplate;
	private final String SQL_GET_ALL = "select * from nmurthy_emp";

	@Autowired
	public EmpDAO(DataSource dataSource) {
		System.out.println("hii");
		jdbcTemplate = new JdbcTemplate(dataSource);
		System.out.println("hello");
	}

	public List<Employee> getAllEmployees() {
		return jdbcTemplate.query(SQL_GET_ALL, new EmployeeMapper());
	}
}
