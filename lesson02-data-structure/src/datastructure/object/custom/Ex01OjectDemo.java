package datastructure.object.custom;

public class Ex01OjectDemo {
	public static void main(String[] args) {
		char x = '^';
		int a = 5;
		
		System.out.println("a--> " + a);
		
	    Item itA = new Item();
	    itA.setId(11);
	    itA.name = 'A';
	    itA.salesPrice = 78d;
	    
	    
	    System.out.println("itA--> " + itA);
	    //System.out.println("itA--> " + itA.toString());
	    
	    Item itB = new Item();
	    itB.setId(22);
	    itB.name = 'b';
	    itB.salesPrice = 45d;
	    
	    System.out.println("itB--> " + itB);
	    
	    Item itC = new Item(33, 'c', 67d);
	    System.out.println("itC--> " + itC);

	    
	}

}
