package Ex04;

import java.math.BigDecimal;

public class Ex04Test {

	public static void main(String[] args) {

		Director d1 = new Director("Nguyễn Văn A", "20/5/1990", new BigDecimal(6.5), new BigDecimal(5.0));

		HeadOfDepartment h1 = new HeadOfDepartment("Trần Văn B", "8/10/1998", new BigDecimal(5), new BigDecimal(4.5),
				"Tài chính");
		HeadOfDepartment h2 = new HeadOfDepartment("Lê Văn C", "8/5/1999", new BigDecimal(5.5), new BigDecimal(4.5),
				"Nhân sự");

		Staff s1 = new Staff("NV1", "8/9/2000", new BigDecimal(4.0), new BigDecimal(0), "Tài chính", "Trần Văn B");
		Staff s2 = new Staff("NV2", "1/5/2000", new BigDecimal(4.0), new BigDecimal(0), "Tài chính", "Trần Văn B");
		Staff s3 = new Staff("NV3", "6/9/2000", new BigDecimal(3.5), new BigDecimal(0), "Nhân sự", "Lê Văn C");
		Staff s4 = new Staff("NV4", "7/3/1999", new BigDecimal(3.5), new BigDecimal(0), "Tài chính", "Trần Văn B");
		Staff s5 = new Staff("NV5", "15/8/1999", new BigDecimal(3.5), new BigDecimal(0), "Nhân sự", "Lê Văn C");
		Staff s6 = new Staff("NV6", "6/3/1999", new BigDecimal(3.5), new BigDecimal(0), "Tài chính", "Trần Văn B");

		HeadOfDepartment[] listHd = { h1, h2 };

		Staff[] staffs = { s1, s2, s3, s4, s5, s6 };

		printf("Câu 1: Hiển thị thông tin nhân sự trong công ty ", d1, listHd, staffs);
		countStaffByHeadOfDepartment("Câu 2: Số lượng nhân viên được quản lý theo từng trưởng phòng ", listHd, staffs);
		salary("Câu 3: Lương của từng loại nhân sự ", d1, listHd, staffs);
	}

	private static void printf(String prefix, Director d1, HeadOfDepartment[] listHd, Staff[] staffs) {
		System.out.println(prefix + " {");
		System.out.println("  + " + d1.toString());

		for (HeadOfDepartment hd : listHd) {
			System.out.println("  + " + hd);
		}
		for (Staff staff : staffs) {
			System.out.println("  + " + staff);
		}
		System.out.println("}\n");
	}

	private static void countStaffByHeadOfDepartment(String prefix, HeadOfDepartment[] listHd, Staff[] staffs) {
		System.out.println(prefix + " {");
		for (HeadOfDepartment hd : listHd) {
			String nameHd = hd.getName();
			int count = 0;
			for (Staff staff : staffs) {
				if (staff.getNameHeadDepartment() == nameHd) {
					count++;
				}
			}
			System.out.println(" Trưởng phòng " + hd.getName() + " quản lý " + count + " nhân viên");
		}
		System.out.println("}\n");
	}

	private static void salary(String prefix, Director d1, HeadOfDepartment[] listHd, Staff[] staffs) {
		System.out.println(prefix + " {");
		BigDecimal sc = d1.getSalaryCoefficient();
		BigDecimal pc = d1.getPositionCoefficient();
		System.out.println("Mức lương của giám đốc: " + (sc.add(pc)).multiply(new BigDecimal(3000000)));

		for (HeadOfDepartment hd : listHd) {
			BigDecimal sc2 = hd.getSalaryCoefficient();
			BigDecimal pc2 = hd.getPositionCoefficient();
			System.out.println("Mức lương của trưởng phòng " + hd.getName() + ": "
					+ (sc2.add(pc2)).multiply(new BigDecimal(2200000)));
		}

		for (Staff staff : staffs) {
			BigDecimal sc3 = staff.getSalaryCoefficient();
			System.out.println(
					"Mức lương của nhân viên " + staff.getName() + ": " + (sc3).multiply(new BigDecimal(1250000)));
		}
		System.out.println("}\n");

	}
}
