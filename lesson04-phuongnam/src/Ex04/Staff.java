package Ex04;

import java.math.BigDecimal;

public class Staff extends HeadOfDepartment {

	private String nameHeadDepartment;

	public Staff() {

	}

	public Staff(String name, String dateOfBirth, BigDecimal salaryCoefficient, BigDecimal positionCoefficient,
			String nameOfDepartment, String nameHeadDepartment) {
		super(name, dateOfBirth, salaryCoefficient, positionCoefficient, nameOfDepartment);
		this.nameHeadDepartment = nameHeadDepartment;
	}

	public String getNameHeadDepartment() {
		return nameHeadDepartment;
	}

	public void setNameHeadDepartment(String nameHeadDepartment) {
		this.nameHeadDepartment = nameHeadDepartment;
	}

	@Override
	public String toString() {

		return "Tên nhân viên: " + getName() + ", " + "Ngày sinh: " + getDateOfBirth() + ", " + "Hệ số lương: "
				+ getSalaryCoefficient() + ", " + "Tên đơn vị: " + getNameOfDepartment() + ", " + "Trưởng phòng: "
				+ getNameHeadDepartment();
	}

}
