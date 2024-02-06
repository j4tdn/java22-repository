package Ex04;

import java.math.BigDecimal;

public class Main {
	
	public static void main(String[] args) {
		Director director = new Director("Nguyen Van A", "01/01/1970", new BigDecimal("2.0"), new BigDecimal("1.2"));
        DepartmentManager departmentManager1 = new DepartmentManager("Tran Thi B", "02/02/1980", new BigDecimal("1.5"), new BigDecimal("1.1"), "Department A");
        DepartmentManager departmentManager2 = new DepartmentManager("Le Van C", "03/03/1990", new BigDecimal("1.6"), new BigDecimal("1.2"), "Department B");
        Staff[] staffs = {
            new Staff("Pham Thi D", "04/04/1985", new BigDecimal("1.0"), "Department A", departmentManager1),
            new Staff("Hoang Van E", "05/05/1988", new BigDecimal("1.1"), "Department A", departmentManager1),
            new Staff("Doan Thi F", "06/06/1995", new BigDecimal("1.2"), "Department A", departmentManager1),
            new Staff("Truong Van G", "07/07/1986", new BigDecimal("0.9"), "Department B", departmentManager2),
            new Staff("Nguyen Thi H", "08/08/1992", new BigDecimal("1.0"), "Department B", departmentManager2),
            new Staff("Le Thi I", "09/09/1998", new BigDecimal("1.1"), "Department B", departmentManager2)
        };
        
        System.out.println("Thông tin nhân sự:");
        System.out.println("========================");
        System.out.println("Giám Đốc:");
        director.displayInformation();
        System.out.println("-------------------");
        System.out.println("Trưởng Phòng:");
        departmentManager1.displayInformation();
        departmentManager2.displayInformation();
        System.out.println("-------------------");
        System.out.println("Nhân viên:");
        for (Staff staff : staffs) {
            staff.displayInformation();
        }

        // Statistics the number of employees managed by each department manager
        System.out.println("\nThống kê số lượng nhân viên được quản lý bởi từng trưởng phòng:");
        System.out.println("==================================================================");
        statisticsNumberOfEmployees(departmentManager1, staffs);
        statisticsNumberOfEmployees(departmentManager2, staffs);

        // Calculate and print the salary of each type of employee
        System.out.println("\nLương của mỗi nhân viên:");
        System.out.println("================================");
        System.out.println("Giám Đốc: " + director.calculateSalary());
        System.out.println("Trường Phòng chi nhánh 1: " + departmentManager1.calculateSalary());
        System.out.println("Trường Phòng chi nhánh 2: " + departmentManager2.calculateSalary());
        for (Staff staff : staffs) {
            System.out.println("Nhân viên: " + staff.calculateSalary());
        }
    }

    // Method to statistics the number of employees managed by each department manager
    public static void statisticsNumberOfEmployees(DepartmentManager departmentManager, Staff[] staffs) {
        int count = 0;
        for (Staff staff : staffs) {
            if (staff.getDepartmentManager().equals(departmentManager)) {
                count++;
            }
        }
        System.out.println("Số nhân viên được quản lý bởi " + departmentManager.fullName + ": " + count);
    }

}


