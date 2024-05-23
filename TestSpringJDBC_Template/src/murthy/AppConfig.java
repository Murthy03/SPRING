package murthy;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "murthy")
@PropertySource("classpath:DB.properties")
public class AppConfig {

	@Autowired
	Environment environment;

	private final String URL = "url";
	private final String US = "un";
	private final String DRIVER = "driver";
	private final String PASSWORD = "password";

	@Bean
	DataSource dataSource() {
		System.out.println(environment.getProperty(US));
		System.out.println(environment.getProperty(URL));

		System.out.println(environment.getProperty(PASSWORD));
		System.out.println(environment.getProperty(US));
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setUrl(environment.getProperty(URL));
		driverManagerDataSource.setUsername(environment.getProperty(US));
		driverManagerDataSource.setPassword(environment.getProperty(PASSWORD));
		driverManagerDataSource.setDriverClassName(environment.getProperty(DRIVER));
		System.out.println(driverManagerDataSource);
		return driverManagerDataSource;
	}
}
