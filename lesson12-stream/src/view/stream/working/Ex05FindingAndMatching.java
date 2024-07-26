package view.stream.working;

import java.util.List;
import java.util.Optional;

public class Ex05FindingAndMatching {
	/*
	 Example: Give a list of numbers: 1, 2, 1, 4, 5, 8, 10, 4, 12
        1st: is there any element that is divisible by 10
        2nd: find the first element that is divisible by 4
        3nd: find the element that is divisible by 5 in the list
        4th: does all elements less than 100
        5th: does no elements greater than 0
	 
	 New Data Type: Optional<T> hạn chế xảy ra NPE
	 */
	public static void main(String[] args) {
		var numbers = List.of(1 , 2, 1, 4, 5, 8, 10, 4, 12);
		
		boolean anyDivBy10 = numbers.stream().anyMatch(nb -> nb % 10 == 0);
		System.out.println("1st: is there any element that is divisible by 10 --> " + anyDivBy10);
		
		Optional<Integer> optDivBy4 = numbers.stream().filter(nb -> nb % 4 == 0).findFirst();
		if (optDivBy4.isPresent()) {
			System.out.println("2nd: find the first element that is divisible by 4 -> " + optDivBy4.get());
		} else {
			System.out.println("2nd: find the first element that is divisible by 4 -> null" );
		}
			
	}
}
