package reading_data_from_properties;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "reading_data_from_properties")
@PropertySource(value = "studentConfig.properties")
public class MyConfig {

}
