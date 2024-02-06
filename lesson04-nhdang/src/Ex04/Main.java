package Ex04;

import java.math.BigDecimal;
import java.util.ArrayList;


public class Main {
	ArrayList<CoreStat> core = new ArrayList<>();
	public static void main(String[] args) {
		Main m = new Main();
		m.showEmployees();
		m.statistical();
		m.salary();
	}
    
	public void showEmployees() {
      Manager m1 = new Manager("Nguyen Van A", "1/1/1990", new BigDecimal("3"), new BigDecimal("2"));
	  Chief c1 = new Chief("Le Van A", "1/2/1990", new BigDecimal("2"), new BigDecimal("1"), "PB.A");
	  Chief c2 = new Chief("Le Van B", "2/2/1990", new BigDecimal("2"), new BigDecimal("1"), "PB.B");
	  Employee e1 = new Employee("Tran Van A", "1/3/2000", new BigDecimal("1"), "PB.A", "Le Van A");
	  Employee e2 = new Employee("Tran Van B", "2/3/2000", new BigDecimal("1"), "PB.A", "Le Van A"); 
	  Employee e3 = new Employee("Tran Van C", "3/3/2000", new BigDecimal("1"), "PB.A", "Le Van B");
	  Employee e4 = new Employee("Tran Van D", "4/3/2000", new BigDecimal("1"), "PB.B", "Le Van B");
	  Employee e5 = new Employee("Tran Van E", "5/3/2000", new BigDecimal("1"), "PB.B", "Le Van B");
	  Employee e6 = new Employee("Tran Van G", "6/3/2000", new BigDecimal("1"), "PB.B", "Le Van B");
	  core.add(m1);
	  core.add(c1);
	  core.add(c2);
	  core.add(e1);
	  core.add(e2);
	  core.add(e3);
	  core.add(e4);
	  core.add(e5);
	  core.add(e6);
	  for (CoreStat c: core) {
		  System.out.println(c);
	  }
	}
	public void statistical() {
		System.out.println("\n");
	    for (CoreStat c : core) {
	        if (c instanceof Chief) {
	            Chief chief = (Chief) c;
	            int employeeCount = countEmployeesByChief(chief.getName());
	            System.out.println("Anh/chị " + chief.getName() + " quản lý " + employeeCount + " nhân viên.");
	        }
	    }
	}

	public int countEmployeesByChief(String chiefName) {
	    int count = 0;
	    for (CoreStat c : core) {
	        if (c instanceof Employee) {
	            Employee employee = (Employee) c;
	            if (employee.getManagerName().equals(chiefName)) {
	                count++;
	            }
	        }
	    }
	    return count;
	}
	
	public void salary() {
		System.out.println("\nMức lương của từng người: ");
	    for (CoreStat c : core) {
	        BigDecimal totalSalary;
	        String nameWithSalary;
	        if (c instanceof Manager) {
	            BigDecimal mSalary = c.getSalaryPoint();
	            BigDecimal mPosition = ((Manager) c).getPositionPoint();
	            totalSalary = (mSalary.add(mPosition)).multiply(new BigDecimal("3000000"));
	            nameWithSalary = c.getName() + ": " + totalSalary.toString();
	        } else if (c instanceof Chief) {
	            BigDecimal cSalary = c.getSalaryPoint();
	            BigDecimal cPosition = ((Chief) c).getPositionPoint();
	            totalSalary = (cSalary.add(cPosition)).multiply(new BigDecimal("2200000"));
	            nameWithSalary = c.getName() + ": " + totalSalary.toString();
	        } else if (c instanceof Employee) {
	            BigDecimal eSalary = c.getSalaryPoint();
	            totalSalary = eSalary.multiply(new BigDecimal("1250000"));
	            nameWithSalary = c.getName() + ": " + totalSalary.toString();
	        } else {
	            nameWithSalary = c.getName() + ": Tạm chưa có";
	        }
	        System.out.println(nameWithSalary);
	    }
	}


}
