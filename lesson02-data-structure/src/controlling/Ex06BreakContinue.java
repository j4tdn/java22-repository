package controlling;

public class Ex06BreakContinue {
public static void main(String[] args) {
	// continute
	
	//break
	for (int i = 0; i < 20; i++) {
		System.out.println("i1--> "+i);
		if (i ==7) {
			continue;
		}
		if(i==2) {
			break;
		}
		System.out.println("i2--->"+i);
	}
}
}
