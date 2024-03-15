package validation_trycatch_throwthrows_finally;

import java.util.Random;

import exception.InvalidAgeException;

public class Ex06CustomException {
	public static void main(String[] args) {
		int age = new Random().nextInt(30);
		
		try {
			boolean isValid = validate(age);
			System.out.println("isValid: " + isValid);
		} catch (InvalidAgeException e) {
			e.printStackTrace();
		}
		
	}
	private static boolean validate(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("-- Age requỉed greater than or equal 18 --");
			
		}
		System.out.println("Age is valid");
		return true;
	}
}
