package scope_annotation;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("stu")
@Scope("prototype")
public class Student {

}
