package view;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

import exception.InvalidAccountException;
import exception.InvalidAccountException.AccountError;

public class Ex04AccountValiadation {
	private static Scanner ip = new Scanner(System.in);
	
	private static Object PRESENT = new Object();
	
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
				System.out.println("Đăng kí thành công --> " + isValid);
				System.out.println(">>Chuyển sang đăng nhập");
				break;
			} catch (InvalidAccountException e) {
				System.out.println("Lỗi -->" +e.getMessage() + "\n");
				
			}
		}while(true);
	
	System.out.println("Kết thúc CT");
	}

	private static boolean validate(String username, String password) throws InvalidAccountException {
		if(password.length() < 8) {
			throw new InvalidAccountException(AccountError.AT_LEAST_ONE_LOWER_UPPER_SPECIAL_LETTER);
		}
		String pattern = "(?=.*[A-Z])(?=.*\\d)(?=.*[~!@#$%^&*]).*";
		if(!password.matches(pattern)) {
			throw new InvalidAccountException(AccountError.AT_LEAST_ONE_LOWER_UPPER_SPECIAL_LETTER);
		}
		
		
		Map<String, Object> usernameLetters = transfer(username);
		Map<String, Object> passwordLetters = transfer(password);
		
		int duplicatedLetters = 0;
		
		for(Entry<String, Object> pEntry : passwordLetters.entrySet()) {
			String pLetter = pEntry.getKey();
			if(usernameLetters.get(pLetter) != null){
				System.out.println(">> dup --> "+pLetter);
//				duplicatedLetters++;
			}
		}
		if(duplicatedLetters > 3) {
			throw new InvalidAccountException(AccountError.OVERLAP_MORE_THAN_REQUIRE_LETTERS);
		}
		
		
		return true;
	}
	
	//Map: Key, Value --> chỉ cho phép sử dụng kdl đối tượng
	//   : 			  --> giá trị của key ko đc trùng nhau
	
	//Từng phần tử trong Map --> Entry --> Entry là 1 đối tượng gồm 2 thuộc tính K và V
	private static Map<String, Object> transfer(String text){
		Map<String, Object> letters = new LinkedHashMap<>();
		for (int i = 0; i<text.length();i++) {
			String letter = "" + text.charAt(i);
			letters.putIfAbsent(letter, PRESENT);
		}
		return letters;
	}
}