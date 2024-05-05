package common;

import bean.Student;

@FunctionalInterface
public interface condition {
	boolean test(Student student);
}
