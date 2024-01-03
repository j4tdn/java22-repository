package homework;

import java.util.Random;

public class Ex10 {
	
	public static void main(String[] args) {
		Random rd = new Random();
		int[] nums = new int[5];
		int count = 0;
		while(count < 5 ) {
			int rdNum = rd.nextInt(11) + 20;
			boolean isDuplicate = false;
			for(int i = 0; i < count ; i++) {
				if(nums[i] == rdNum) {
					isDuplicate = true;
					break;
				}
			}
			if(!isDuplicate) {
				nums[count] = rdNum;
				count++;
			}
		}
		System.out.println("5 số nguyên ngẫu nhiên từ 20 đến 30 là: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(nums[i] + " ");
        }
	}
	
}
