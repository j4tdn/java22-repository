package view;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import exception.InvalidAccountException;
import exception.InvalidAccountException.AccountError;

public class Ex04AccountValidation {
	
	private static Object PRESENT = new Object();
	private static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		String username = "";
		String password = "";
		
		do {
			try {
				System.out.print("Nhập tài khoản: ");
				username = ip.nextLine();
				System.out.print("Nhập mật khẩu: ");
				password = ip.nextLine();
				boolean isValid = validate(username, password);
				System.out.println(">> Đăng ký tài khoản thành công --> " + isValid);
				System.out.println(">> Chuyển trang sang đăng nhập");
				break;
			} catch (InvalidAccountException e) {
				System.out.println("Lỗi --> " + e.getMessage() + "\n");
			}
		} while(true);
		
		System.out.println("----- Kết thúc chương trình ---------");
		
	}
	
	// ?= có cũng được ko cũng được
	// . bất kỳ kí tự nào
	// * từ 0 đến n kí tự
	// [A-Z] 1 kí tự trong khoảng từ A đến Z
	
	private static boolean validate(String username, String password) throws InvalidAccountException {
		if(password.length() < 8) {
			throw new InvalidAccountException(AccountError.LESS_THAN_REQUIRE_LENGTH);
		}
		
		String pattern = "(?=.*[A-Z])(?=.*\\d)(?=.*[~!@#$%^&*]).*";
		if(!password.matches(pattern)) {
			throw new InvalidAccountException(AccountError.AT_LEAST_ONE_DIGIT_UPPER_SPECIAL_LETTER);
		}
		
		int duplicatedLetters = countNumberOfOverlappingLetters(username, password);
		
		if(duplicatedLetters > 3) {
			throw new InvalidAccountException(AccountError.OVERLAP_MORE_THAN_REQUIED_LETTERS);
		}
		
		return true;
	}
	
	private static int countNumberOfOverlappingLetters(String username, String password) {
		Map<String, Object> usernameLetters = transfer(username);
		Map<String, Object> passwordLetters = transfer(password);	
		
		int duplicatedLetters = 0;
		
		for (Entry<String, Object> pEntry: passwordLetters.entrySet()) {
			String pLetter = pEntry.getKey();
			if(usernameLetters.get(pLetter) != null) {
				duplicatedLetters++;
			}
		}
		
		return duplicatedLetters;
	}
	
	// Map: key, value --> chỉ cho phép sử dụng KDL đối tượng
	// 	  : 		   --> giá trị của key ko được trùng nhau
	// Từng phần tử trong Map --> Entry --> Entry là 1 đối tượng gồm tt K và V 
	private static Map<String, Object> transfer(String text){
		Map<String, Object> letters = new LinkedHashMap<>();
		for(int i = 0; i < text.length(); i++) {
			String letter = "" + text.charAt(i);
			letters.putIfAbsent(letter, PRESENT);
		}
		
		return letters;
	}
}
