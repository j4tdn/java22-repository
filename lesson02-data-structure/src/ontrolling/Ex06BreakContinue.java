package ontrolling;

public class Ex06BreakContinue {
	
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			System.out.println("i1 --> " + i);
			
			if (i == 2) {
				continue;
			}
			
			if (i == 7) {
				break;
			}
			
			System.out.println("i2 --> " + i);
		}
	}

}
