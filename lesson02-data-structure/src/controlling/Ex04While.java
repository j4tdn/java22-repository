package controlling;

public class Ex04While {

	public static void main(String[] args) {
		
		int i = 1;
		int n = 20;
		
//		while(i < n) {
//			if(i % 2 != 0) {
//				System.out.println("i --> " + i);
//			
//			}
//			i++;
//		}
		
		while(i < n) {
			System.out.println("i --> " + i);
			i += 2;
		}
	}
}
