package lesson04;

import java.math.BigDecimal;
import java.time.LocalDate;

public class HRM {

	public static void main(String[] args) {
		Direction direction = new Direction("Nguyen Van A", LocalDate.of(1970, 02, 06), new BigDecimal("3.5"),
				new BigDecimal("0.8"));
		Manager manage1 = new Manager("Tran Thi B", LocalDate.of(1985, 05, 15), new BigDecimal("2.5"),
				new BigDecimal("0.5"), "Phong A");
		Manager manage2 = new Manager("Le Van C", LocalDate.of(1978, 10, 20), new BigDecimal("2.7"),
				new BigDecimal("0.6"), "Phong B");

		Personnel[] personnels = { direction, manage1, manage2,
				new Personnel("Nguyen Van D", LocalDate.of(1990, 02, 10), new BigDecimal("1.8"), new BigDecimal("0.3")),
				new Personnel("Tran Thi E", LocalDate.of(1988, 12, 25), new BigDecimal("2.0"), new BigDecimal("0.4")),
				new Personnel("Nguyen Van D", LocalDate.of(1993, 04, 30), new BigDecimal("1.7"), new BigDecimal("0.2")),
				new Personnel("Nguyen Van D", LocalDate.of(1980, 06, 22), new BigDecimal("1.6"),
						new BigDecimal("0.1")) };

		System.out.println("Thông tin các nhân sự:");
		for (Personnel personnel : personnels) {
			System.out.println("Họ và tên: " + personnel.name);
			System.out.println("Ngày sinh: " + personnel.year);
			System.out.println("Lương: " + personnel.calcSalary());
			if (personnel instanceof Manager) {
				System.out.println("Đơn vị: " + ((Manager) personnel).unitName);
			}
			System.out.println();
		}

		System.out.println("Thống kê số lượng nhân viên được quản lý bởi từng trưởng phòng:");
		int count1 = 0, count2 = 0;
		for (Personnel personnel : personnels) {
			if (personnel instanceof Manager) {
				if (((Manager) personnel).unitName.equals("Phong A")) {
					count1++;
				} else if (((Manager) personnel).unitName.equals("Phong B")) {
					count2++;
				}
			}
		}
		System.out.println("Trưởng Phòng Phòng A: " + count1 + " nhân viên");
		System.out.println("Trưởng Phòng Phòng B: " + count2 + " nhân viên");

	}

}
