package Ex01_QLSV;

import java.math.BigDecimal;
import java.sql.Array;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.w3c.dom.css.Counter;

public class Main {
	private static SinhVien[] ListSV = new SinhVien[3];
	public static void main(String[] args) {
		//Tạo danh sách sinh viên
		SinhVien sv1 = new SinhVien(101,"Hoàng Nhung",new BigDecimal("9"),new BigDecimal("9"));
		ListSV[0] = sv1;
		SinhVien sv2 = new SinhVien(102,"An Chinh",new BigDecimal("10"),new BigDecimal("9"));
		ListSV[1] = sv2;
		SinhVien sv3 = new SinhVien();
		sv3 = inputSV();
		ListSV[2] = sv3;
		System.out.println("***	Danh sách sinh viên	***");
		outputSV(ListSV);
		System.out.println("***	Danh sách sinh viên có điểm trung bình hơn 8,5	***");
		outputSV(SearchByAverageScore());
		System.out.println("***	Danh sách sinh viên có điểm lý thuyết lớn hơn thực hành	***");
		outputSV(SearchByTheoryScoreAndPracticeScore());
	}
	
//Viết hàm tìm thông tin sinh viên có điểm trung bình lớn hơn 8.5
	public static SinhVien[] SearchByAverageScore() {
		SinhVien[] Result = new SinhVien[3];
		int counter = 0;
		for(SinhVien sv : ListSV) {
			if(sv.averageScore().compareTo(new BigDecimal("8.5"))>0) {
				Result[counter++] = sv;
			}
		}
		return  Arrays.copyOfRange(Result, 0, counter);
	}
	
//Viết hàm tìm thông tin sinh viên có điểm lý thuyết lớn hơn điểm thực hành
	public static SinhVien[] SearchByTheoryScoreAndPracticeScore() {
		SinhVien[] Result = new SinhVien[3];
		int counter = 0;
		for(SinhVien sv : ListSV) {
			if(sv.getTheoryScore().compareTo(sv.getPracticeScore())>0) {
				Result[counter++] = sv;
			}
		}
		return  Arrays.copyOfRange(Result, 0, counter);
	}
	
	public static SinhVien inputSV() {
		Scanner ip = new Scanner(System.in);
		SinhVien sv = new SinhVien();
		do {

			System.out.println(" Nhập id: ");
			String idStr = ip.nextLine();
			if (isNumber(idStr)) {
				sv.setId(Integer.parseInt(idStr));
				break;
			}
		}while(true);
		System.out.println(" Nhập tên đầy đủ: ");
		sv.setFullName(ip.nextLine());
		do {

			System.out.println(" Nhập điểm lý thuyết: ");
			String scoreStr = ip.nextLine();
			try {
		    	sv.setTheoryScore(new BigDecimal(scoreStr)); 
		        break;
		    } catch (NumberFormatException e) {
		    }
		}while(true);
		do {

			System.out.println(" Nhập điểm thực hành: ");
			String scoreStr = ip.nextLine();
			try {
		    	sv.setPracticeScore(new BigDecimal(scoreStr)); 
		        break;
		    } catch (NumberFormatException  e) {
		    }
		}while(true);
		
		return sv;
	}
	public static void outputSV(SinhVien[] list) {
		System.out.println("\nID\tHọ và tên\t Điểm lý thuyết\tĐiểm thực hành");
		for(SinhVien sv : list) {
			System.out.println(sv.toString());
		}
		System.out.println("\n");
	}
	
	 private static boolean isNumber(String text) {
			for (int i = 0; i < text.length(); i++) {
				char letter = text.charAt(i);
				if (!Character.isDigit(letter)) {
					return false;
				}
			}
			return true;
		}

}
//(0_0)