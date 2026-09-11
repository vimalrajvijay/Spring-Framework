package dependency_injection_java_based;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {

	
	private int id;
	
	private String name;
	
	private Mobile mobile;
	
	public Person(@Value("101") int id,@Value("abc") String name, Mobile mobile) {
		this.id = id;
		this.name = name;
		this.mobile = mobile;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public Mobile getMobile() {
		return mobile;
	}
	
	public void setMobile(Mobile mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", mobile=" + mobile + "]";
	}
}
