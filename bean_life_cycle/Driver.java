package bean_life_cycle;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

	public static void main(String[] args) {
		ConfigurableApplicationContext con 
		 = new AnnotationConfigApplicationContext(MyConfig.class);
		
		con.getBean("mobile");
		
		//con.close();
	}
}
