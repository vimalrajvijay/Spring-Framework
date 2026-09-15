package import_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({MyConfig2.class, MyConfig3.class})
public class MyConfig1 {
	@Bean
	public Student getStudent() {
		return new Student();
	}
}
