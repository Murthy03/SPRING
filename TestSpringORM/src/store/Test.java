package store;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("store/spring-servlet.xml");
		EmpDAO dao = (EmpDAO) context.getBean("empDAO");
		List<Employee> elist = dao.findAll();
		System.out.println(elist);
	}

}
