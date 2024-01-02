package datastructure.array;

import java.util.Arrays;
import java.util.Random;

public class Ex02ArrayStringDemo {
	public static void main(String[] args) {

		// BT2: chon 2 sinh vien ngau nhien trong danh sach de lam,....

		// Tong quat: chọn 'k' sv trong n(length) sv --> k trung nhau
		// input: student, k
		// output: pickedStudents --> length =k
		// == so sanh gia tri o stack
		// string --- so sanh gia tri o heap--- dung ham equals
//	String s1="hello";// H1
//	String s2="hello";//H1
//	String s3="hallo";//H2
//	
//	System.out.println("===>" +(s1==s2));
//	System.out.println("===>" +(s1==s3));
//	
//	
//	String o1= new String ("hello");// H1
//	String o2= new String ("hello");// H1
//	String o3= new String ("hallo");// H1
//	
//	
//	System.out.println("===>" +(o1==o2));
//	System.out.println("===>" +(o1==o3));
//
//	System.out.println("===>" +(o1.equals(o2)));
//	System.out.println("===>" +(o1.equals(o3)));
		Random rd = new Random();
		String[] students = { "Le Teo", "Hoang Anh", " Van Nam", "Ngoc tai", "Dao Anh" };
		int k = 3;
		int running = 0;
		String[] pickedStudents = new String[k];
		while (true) {
			// B1: random ra 1 phan tu
			String temp = students[rd.nextInt(students.length)];

			// B2: kiem tra phan tu nay da duoc random, hay chon truoc do chua
			// == xem thu phan tu temp da thuoc mang pickedStudents chua
			if (isExist(temp, pickedStudents)) {
				// 2.1 neu da ton tai--> bo qua--> random thang moi
				continue;
			}

			// 2.1 neu da ton tai roi --> bo qua--> random thang moi
			pickedStudents[running] = temp;
			running++;

			// 2.2 neu chua ton tai --> dua/gan vao phan tu tiep theo trong pickedStudents
			// ---> khi so luong dua vao = k = students.length --> dung lai
			if (running == k) {
				break;
			}

		}
		System.out.println("pickedStudents---->" + Arrays.toString(pickedStudents));
	}

	private static boolean isExist(String checkingElement, String[] elements) {
		for (int i = 0; i < elements.length; i++) {
			if (checkingElement.equals(elements[i])) {
				return true;
			}
		}
		return false;
	}
}
