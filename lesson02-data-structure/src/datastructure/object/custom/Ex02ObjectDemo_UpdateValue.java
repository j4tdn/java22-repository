package datastructure.object.custom;

public class Ex02ObjectDemo_UpdateValue {
	public static void main (String [] args) {
		Item itA = new Item(1,'A',111d);
		Item itB = new Item(2,'B',222d);
		Item itC = new Item(3,'C',333d);
		
		System.out.println("itA ---> " + itA.hashCode());
		System.out.println("itB ---> " + itB.hashCode());
		System.out.println("itC ---> " + itC.hashCode());
		
		itB.salesPrice =444d;
		itC.id =6;
		itA= itB;
		itA.salesPrice=777d;
		
		System.out.println("itA ---> " + itA.hashCode());
		System.out.println("itB ---> " + itB.hashCode());
		System.out.println("itC ---> " + itC.hashCode());
		
		
		System.out.println("itA ---> " + itA);
		System.out.println("itB ---> " + itB);
		System.out.println("itC ---> " + itC);
		
	}
	
}
