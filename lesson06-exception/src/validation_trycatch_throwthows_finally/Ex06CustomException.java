package validation_trycatch_throwthows_finally;

import java.util.Random;

public class Ex06CustomException {
	 public static void main(String[] args) {
		int age =  new Random().nextInt(30);
		
		boolean a = false;
		try {
			a = validate(age);
		} catch (InvalidAgeException e) {
			e.printStackTrace();
		}
		System.out.println("isvalid " + a );
	}
	 private static boolean validate(int age) throws InvalidAgeException {
		 if(age < 18) {
			 throw new InvalidAgeException(" -- Age required greater than or equal 18 --");
		 }
		 System.out.println("Age is valid");
		 return true;
	}
}
