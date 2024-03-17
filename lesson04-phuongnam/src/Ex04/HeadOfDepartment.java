package Ex04;

import java.math.BigDecimal;

public class HeadOfDepartment extends Director {

	private String nameOfDepartment;

	public HeadOfDepartment() {

	}

	public HeadOfDepartment(String name, String dateOfBirth, BigDecimal salaryCoefficient,
			BigDecimal positionCoefficient, String nameOfDepartment) {
		super(name, dateOfBirth, salaryCoefficient, positionCoefficient);
		this.nameOfDepartment = nameOfDepartment;
	}

	public String getNameOfDepartment() {
		return nameOfDepartment;
	}

	public void setNameOfDepartment(String nameOfDepartment) {
		this.nameOfDepartment = nameOfDepartment;
	}

	@Override
	public String toString() {

		return "Tên trưởng phòng: " + getName() + ", " + "Ngày sinh: " + getDateOfBirth() + ", " + "Hệ số lương: "
				+ getSalaryCoefficient() + ", " + "Hệ số chức vụ: " + getPositionCoefficient() + ", " + "Tên đơn vị: "
				+ getNameOfDepartment();
	}

}
