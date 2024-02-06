package Ex04;

import java.math.BigDecimal;

public class Employee extends People {
	private String departName;
	Manager manager;
	public Employee() {}
	public Employee(String name, String date, BigDecimal coeffSalary, String departName, Manager manager) {
		super(name, date, coeffSalary);
		this.departName = departName;
		this.manager = manager;
	}
	public String getDepartName() {
		return departName;
	}
	public void setDepartName(String departName) {
		this.departName = departName;
	}
	public Manager getManager() {
		return manager;
	}
	public void setManager(Manager manager) {
		this.manager = manager;
	}
	@Override
	public String toString() {
		return "Employee [departName=" + departName + ", manager=" + manager.getName() + ", Name=" + getName()
				+ ", Date=" + getDate() + ", CoeffSalary=" + getCoeffSalary();
	}
	public static void showAllEmployee(Employee arr[]) {
		System.out.println("Thông tin các nhân sự có trong công ty");
		for(Employee x : arr) {
			System.out.println(x.toString());
		}
	}
	public static void salary(Employee em) {
		System.out.println("Mức lương của nhân viên");
		System.out.println(em.getCoeffSalary().multiply(new BigDecimal("1250000")));
	}
	

}
