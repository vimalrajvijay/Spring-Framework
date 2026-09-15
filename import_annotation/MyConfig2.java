package import_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class MyConfig2 {

	@Bean
	public Employee getEmployee() {
		return new Employee();
	}
}
