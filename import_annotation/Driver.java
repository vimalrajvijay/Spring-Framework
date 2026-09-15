package import_annotation;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext con 
		 = new AnnotationConfigApplicationContext(MyConfig1.class);
		
		Student s = (Student)con.getBean("getStudent");
		System.out.println(s);
		
		Employee e = (Employee)con.getBean("getEmployee");
		System.out.println(e);
	}

}
