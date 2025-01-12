package service;

import java.util.List;
import java.util.Map;

import persistence.Student;

public interface StudentService<Interger> {
List<Student> getStudentsByClassId( int id);
Map<Integer, Integer> getAmountOfStudentPerClass();
}
