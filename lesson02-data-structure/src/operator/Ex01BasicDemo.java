package operator;

public class Ex01BasicDemo {
public static void main (String [] args) {
	int v=2;
	v = v-- - v-- + v++;
	int a =6;
	System.out.println("v1 --> "+ v);
	
	boolean isEven = (a%2==0);
	boolean isGreaterThan10 = (a>=10);
	System.out.println("isEven --> " + isEven);
	System.out.println("isGreaterThan10 --> " + isGreaterThan10);

    int v3= 2;
    int v4= 2;
    boolean v6Test=(++v3>2)||(v4--%2!=0);
    System.out.println("v6Test --> " +v6Test);
    System.out.println("v3 --> " + v3);
    System.out.println("v4 --> " + v4);
    
    int i = 2;
    if(++i>2&&i++>2) {
    	i++;
    }
    if (i++>4||++i>5) {
    	System.out.println(i);
    }
    if(i++<4||++i>5) {
    	System.out.println(i);
    }
}
}
