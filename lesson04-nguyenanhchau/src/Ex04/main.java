package Ex04;

import java.math.BigDecimal;

public class main {

	public static void main(String[] args) {

		Boss bo = new Boss("Jack" , "22/1/2022" , new BigDecimal("3.2"), new BigDecimal("4.4"));
		
		Manager ma1 = new Manager("Linda","2/3/2022", new BigDecimal("2.2"), new BigDecimal("3.3"), "Finance");
		Manager ma2 = new Manager("Lily","12/6/2022", new BigDecimal("2.2"), new BigDecimal("3.3"), "Marketing");
		
		Employee em1 = new Employee("Hindia","4/12/2022", new BigDecimal("1.1"), "Finance" , ma1 );
		Employee em2 = new Employee("Bean","16/3/2022", new BigDecimal("1.1"), "Finance" , ma1 );
		Employee em3 = new Employee("Cindy","10/2/2022", new BigDecimal("1.1"), "Marketing" , ma2 );
		Employee em4 = new Employee("Rinker","5/5/2022", new BigDecimal("1.1"), "Marketing" , ma2 );
		Employee em5 = new Employee("Filley","27/1/2022", new BigDecimal("1.1"), "Marketing" , ma2 );
		Employee em6 = new Employee("Hand","19/11/2022", new BigDecimal("1.1"), "Marketing" , ma2 );

	    Employee[] arr = {em1,em2,em3,em4,em5,em6};
	    Employee.showAllEmployee(arr);
	    
	    Manager.numberOfEm(ma1, arr);
	    Manager.numberOfEm(ma2, arr);
	    
	    Boss.salary(bo);
	    Manager.salary(ma1);
	    Employee.salary(em1);

	    
	}

}
