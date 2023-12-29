package datastructure.object.custom;

public class Ex01objectDemo {
	public static void main(String[] args) {
		// Integer --> int value 
		// String --> byte [] value
		// Character --> 
		
		
		Item x = new Item();
		// Item item2 = 
		Item item = new Item(1, 'A', 11);
		
		Integer i1 = new Integer(22); //1 
		Integer i2 = new Integer (33);//2
		Integer i3 = new Integer (33);//3
		System.out.println("i1 code --> " + System.identityHashCode(i1));
		System.out.println("i2 code --> " + System.identityHashCode(i2));
		System.out.println("i3 code --> " + System.identityHashCode(i3));
		
		Integer n1 = 55;    //4
		Integer n2 = 66;   //5
		Integer n3 = 66; 
		
		System.out.println("n1 code --> " + System.identityHashCode(n1));
		System.out.println("n2 code --> " + System.identityHashCode(n2));
		System.out.println("n3 code --> " + System.identityHashCode(n3));
		String s1 = new String("helo");
		String s2 = "xin chao";
		
		Character c1 = new Character('a');
		Character c2 = 'B';
		n3 = 88;
		System.out.println("n2 --> " + n2);
		System.out.println("n3 --> " + n3);
	}
    		
	}


