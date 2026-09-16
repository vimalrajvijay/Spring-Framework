package bean_life_cycle;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
@Lazy
public class Mobile {
	public Mobile() {
		System.out.println("Mobile");
	}
//	@PostConstruct
//	public void init() {
//		System.out.println("Initialization");
//	}
//	@PreDestroy
//	public void destroy() {
//		System.out.println("Destruction");
//	}
}
