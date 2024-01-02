package datastructure.primitive;

public class Ex02PrimitiveDemo_VariableScope {	
	    // [acess_modifier] [static] data_type variable_name [=] [initial value];
	    private static int w =333;
	    public static double z= 88.22d; 
       public static void main(String[] args) {
		    // khai bao bien trong  ham --> bien cuc bo == local variable
    	   // pham vi su dung lon nhat la ben trong ham
    	   // bien co pham vi la block scope
    	   int a=88;
    	   int b=22;
    	   
    	   {
    		   char x ='@';
    		   System.out.println(" x block --> "+ x);
    		   System.out.println(" a block --> "+ a);    		   
    	   }
    	   
    	   System.out.println("a -> " +a);
    	   System.out.println("b -> " +b);
    	   
    	   Ex02PrimitiveDemo_VariableScope.demo();
    	   
    	   System.out.println(" call w from main -- >"+ Ex02PrimitiveDemo_VariableScope.w);
    	   System.out.println(" call z from main -- >"+ Ex02PrimitiveDemo_VariableScope.z);
    	   
	}
       
       private static void demo() {
    	   int x = 11;
    	   int y = 17;
    	   System.out.println("x -> " +x);
    	   System.out.println("y -> " +y);
    	   System.out.println(" call w from demo -- >"+ Ex02PrimitiveDemo_VariableScope.w);
    	   System.out.println(" call z from demo -- >"+ Ex02PrimitiveDemo_VariableScope.z);
       }
}
