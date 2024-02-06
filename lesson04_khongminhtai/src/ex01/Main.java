package ex01;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Khoi tao doi tuong sinh vien
        Students o1 = new Students(100, "Minh Tai", 9.0f, 9.0f);
        Students o2 = new Students(120, "Thanh Tung", 7.5f, 6.6f);
        Students o3 = new Students();
        input(o3);
        // Tao mang ve them dt sinh vien vao mang
        Students[] studentsArray = { o1, o2, o3 };
        // Loc sv > 8.5
        
        Students[] goodStudents = betterThan85(studentsArray);
        print("sinh viên có đtb lớn hơn 8.5 ", goodStudents);
        //Loc sv ly thuyet > thuc hanh
        
        Students[] theoreticalStudents = theoreticalHigherThanPractice(studentsArray);
        print("Sinh viên có điểm lt> thực hành ", theoreticalStudents);
    }

    public static void input(Students student) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã sinh viên");
        int id = scanner.nextInt();
        student.setId(id);
        System.out.println("Nhập họ tên ");
        String name = scanner.next();
        student.setName(name);
        System.out.println("Nhập điểm lý thuyết");
        float theoreticalPoint = scanner.nextFloat();
        student.setTheoreticalPoint(theoreticalPoint);
        System.out.println("Nhập điểm thực hành");
        float practicePoint = scanner.nextFloat();
        student.setPracticePoint(practicePoint);

        System.out.println("Nhập Sinh viên :  --> " + student.toString());
    }

    // Hàm lọc sinh viên có điểm trung bình lớn hơn 8.5
    public static Students[] betterThan85(Students[] studentsArray) {
        Students[] result = new Students[studentsArray.length];
        int counter = 0;
        for (Students student : studentsArray) {
            if (student.averagePoint() > 8.5) {
                result[counter] = student;
                counter++;
            }
        }
        return Arrays.copyOfRange(result, 0, counter);
    }

    // Hàm lọc sinh viên có điểm lt> th
    public static Students[] theoreticalHigherThanPractice(Students[] studentsArray) {
        Students[] result = new Students[studentsArray.length];
        int counter = 0;
        for (Students student : studentsArray) {
            if (student.getTheoreticalPoint() > student.getPracticePoint()) {
                result[counter] = student;
                counter++;
            }
        }
        return Arrays.copyOfRange(result, 0, counter);
    }

    public static void print(String prefix, Students[] studentsArray) {
        System.out.println(prefix + " {");
        for (Students student : studentsArray) {
            System.out.println("  + " + student);
        }
        System.out.println("}\n");
    }
}
