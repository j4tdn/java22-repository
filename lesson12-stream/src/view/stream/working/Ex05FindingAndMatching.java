package view.stream.working;

import java.util.List;
import java.util.Optional;

public class Ex05FindingAndMatching {

	public static void main(String[] args) {

		var numbers = List.of(1 , 2,1,4,5,8,10,4,12);
		
		boolean anyDivBy10 = numbers.stream().anyMatch(nb -> nb % 10 == 0);
		System.out.println("1st: is there any element that is divisible by 10 --> " + anyDivBy10);
		
		Optional<Integer> optDivBy4 = numbers.stream().filter(nb -> nb % 4 == 0).findFirst();
		
		if(optDivBy4.isPresent()) {
			System.out.println(optDivBy4.get());
		}
		
	}

}
