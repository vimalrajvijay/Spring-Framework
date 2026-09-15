package bean_annotation;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import NoUniqueBeanDefinition.Car;
import import_annotation.Employee;

public class Driver {

	public static void main(String[] args) {
		 ConfigurableApplicationContext con 
		 = new AnnotationConfigApplicationContext(MyConfig.class);
		 
		 
		 Employee e = (Employee)con.getBean("getEmployee");
		 System.out.println(e);
	}
}
