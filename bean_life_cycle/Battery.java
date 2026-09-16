package bean_life_cycle;

import org.springframework.stereotype.Component;

@Component
public class Battery {

	public Battery() {
		System.out.println("Battery");
	}
}
