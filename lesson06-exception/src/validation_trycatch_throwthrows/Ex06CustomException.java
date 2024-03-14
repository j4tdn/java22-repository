package validation_trycatch_throwthrows;

import java.util.Random;

import Exception.InvalidAgeException;

public class Ex06CustomException {
	
	public static void main(String[] args) {
		
		int age = new Random().nextInt(30);
		try {
			boolean isValid = validate(age);
		} catch (InvalidAgeException e) {
			e.printStackTrace();
		}
		System.out.println();
	}
	
	private static boolean validate(int age) throws InvalidAgeException {
		if (age<18) {
			throw new InvalidAgeException("Age required greater then or equal 18 --- ");
		}
		System.out.println(" age is valid");
		return true;
	}
}
