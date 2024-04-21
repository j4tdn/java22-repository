package EX01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Students> students = new ArrayList<>();
        students.add(new Students(102, "Nam", Arranges.C));
        students.add(new Students(103, "Bảo", Arranges.F));
        students.add(new Students(104, "Hoàng", Arranges.D));
        students.add(new Students(105, "Nguyên", Arranges.B));
        students.add(new Students(107, "Vũ", Arranges.F));
        students.add(new Students(109, "Lan", Arranges.A));
        students.add(new Students(202, "Đạt", Arranges.C));
        students.add(new Students(103, "Bảo", Arranges.F));
        students.add(new Students(107, "Vũ", Arranges.C));
        students.add(new Students(104, "Hoàng", Arranges.B));

        List<Students> ListAStudents = new ArrayList<>();
        List<Students> ListRestudying = new ArrayList<>();

        for (Students student : students) {
            if (student.getArranges() == Arranges.A) {
            	ListAStudents.add(student);
            }
            if (student.getArranges() == Arranges.F) {
            	ListRestudying.add(student);
            }
        }

        System.out.println("List of Type A students:");
        for (Students student : ListAStudents) {
            System.out.println("ID: " + student.getID() + ", Name: " + student.getName());
        }

        System.out.println("\nList of students re-studying:");
        for (Students student : ListRestudying) {
            System.out.println("ID: " + student.getID() + ",Name: " + student.getName());
        }
    }
}