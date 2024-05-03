package common;

import bean.Student;

@FunctionalInterface
public interface Condition {
	
	boolean test(Student student);
	
}
