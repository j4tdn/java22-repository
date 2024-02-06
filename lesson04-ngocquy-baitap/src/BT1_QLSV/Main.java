package BT1_QLSV;

import java.math.BigDecimal;
import java.sql.Array;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	private static SinhVien[] ListSV = new SinhVien[3];
	public static void main(String[] args) {
		SinhVien SV1 = new SinhVien(142, "Cao Ngoc Quy", new BigDecimal("8"), new BigDecimal("7"));
		ListSV[0] = SV1;
		SinhVien SV2 = new SinhVien(035, "Dao Duy Anh", new BigDecimal("9"), new BigDecimal("9"));
		ListSV[1] = SV2;
		SinhVien SV3 = new SinhVien();
		SV3 = inputSV();
		ListSV[2] = SV3;
		System.out.println("==================================================================================");
		System.out.println("***	Danh sách sinh viên	***");
		outputSV(ListSV);
		System.out.println("==================================================================================");
		System.out.println("***	Danh sách sinh viên có điểm trung bình hơn 8,5	***");
		outputSV(SearchSvByAveragePoint());
		System.out.println("==================================================================================");
		System.out.println("***	Danh sách sinh viên có điểm lý thuyết lớn hơn thực hành	***");
		outputSV(SearchSvByTheoryAndPractice());
		System.out.println("==================================================================================");

	}
	
	public static SinhVien inputSV() {
		Scanner ip = new Scanner(System.in);
		SinhVien sv = new SinhVien();
		do {
			System.out.print("Nhập id: ");
			String idStr = ip.nextLine();
			if (isNumber(idStr)) {
				sv.setId(Integer.parseInt(idStr));
				break;
			}
		} while (true);
		System.out.print("Nhập tên đầy đủ: ");
		sv.setFullName(ip.nextLine());
		do {
			System.out.print("Nhập điểm lý thuyết: ");
			String scoreStr = ip.nextLine();
			try {
				sv.setTheoryPoint(new BigDecimal(scoreStr));
				break;
			} catch (NumberFormatException e) {
			}
		} while (true);
		do {
			System.out.print("Nhập điểm thực hành: ");
			String scoreStr = ip.nextLine();
			try {
				sv.setPracticePoint(new BigDecimal(scoreStr));
				break;
			} catch (NumberFormatException e) {
			}
		} while (true);

		return sv;
	}
	
	public static void outputSV(SinhVien[] list) {
		System.out.println("\nID \t Họ và tên \t Điểm lý thuyết \t Điểm thực hành");
		for (SinhVien sv : list) {
			System.out.println(sv.toString());
		}
		System.out.println("\n");
	}
	
	// hàm tìm thông tin sinh viên có điểm trung bình lớn hơn 8.5
	public static SinhVien[] SearchSvByAveragePoint() {
		SinhVien[] rs = new SinhVien[3];
		int counter = 0;
		for(SinhVien SV : ListSV) {
			if(SV.averagePoint().compareTo(new BigDecimal("8.5"))>0) {
				rs[counter++] = SV;
			}
		}
		return Arrays.copyOfRange(rs, 0 , counter);
	}
	
	// hàm tìm thông tin sinh viên có điểm lý thuyết lớn hơn điểm thực hành
	public static SinhVien[] SearchSvByTheoryAndPractice() {
		SinhVien[] rs = new SinhVien[3];
		int counter = 0;
		for(SinhVien sv : ListSV) {
			if(sv.getTheoryPoint().compareTo(sv.getPracticePoint())>0) {
				rs[counter++] = sv;
			}
		}
		return  Arrays.copyOfRange(rs, 0, counter);
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
