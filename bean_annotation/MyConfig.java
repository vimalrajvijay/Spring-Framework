package bean_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import import_annotation.Employee;

@Configuration
public class MyConfig {

	@Bean
	public Employee getEmployee() {
		return new Employee();
	}
}
