	package Ex01;

import java.util.ArrayList;
import java.util.List;	
import Ex01.Student;

import javax.naming.spi.DirStateFactory.Result;

public class Main {
	
	public static void main(String[] args) {
        Student[] students = {
            new Student(102, "Nam", Grade.C),
            new Student(103, "Bảo", Grade.F),
            new Student(104, "Hoàng", Grade.D),
            new Student(105, "Nguyên", Grade.B),
            new Student(107, "Vũ", Grade.F),
            new Student(109, "Lan", Grade.A),
            new Student(202, "Đạt", Grade.C),
            new Student(103, "Bảo", Grade.F),
            new Student(107, "Vũ", Grade.C),
            new Student(104, "Hoàng", Grade.B)
        };

        // Danh sách sinh viên đạt loại A trong năm 2021
        Student[] studentsWithGradeA = getStudentsWithGrade(students, Grade.A);
        System.out.println("Danh sách sinh viên đạt loại A trong năm 2021:");
        for (Student student : studentsWithGradeA) {
            System.out.println(student);
        }

        // Danh sách sinh viên đã tham gia học lại môn cấu trúc dữ liệu trong năm 2021
        Student[] studentsRelearning = getStudentsRelearning(students);
        System.out.println("\nDanh sách sinh viên đã tham gia học lại môn cấu trúc dữ liệu trong năm 2021:");
        for (Student student : studentsRelearning) {
            System.out.println(student);
        }
    }

    // Phương thức để tìm danh sách sinh viên đạt loại A trong năm 2021
    public static Student[] getStudentsWithGrade(Student[] students, Grade grade) {
        List<Student> resultList = new ArrayList<>();
        for (Student student : students) {
            if (student.getGrade() == grade) {
                resultList.add(student);
            }
        }
        return resultList.toArray(new Student[0]);
    }

    // Phương thức để tìm danh sách sinh viên đã tham gia học lại môn cấu trúc dữ liệu trong năm 2021
    public static Student[] getStudentsRelearning(Student[] students) {
        List<Student> resultList = new ArrayList<>();
        for (Student student : students) {
            if (student.getGrade() == Grade.F) {
                resultList.add(student);
            }
        }
        return resultList.toArray(new Student[0]);
    }
}
enum Grade {
    A, B, C, D, E, F
}
