package murthy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmployeeController {

	@Autowired
	private EmpDAO empDAO;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getAllEmployees(Model model) {
		List<Employee> employees = empDAO.getAllEmployees();
		model.addAttribute("employees", employees);
		return "employees";
	}
}
