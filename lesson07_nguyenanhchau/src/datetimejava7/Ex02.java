package exercises;

import java.text.ParseException;

import java.text.SimpleDateFormat;

import java.util.Calendar;

import java.util.Date;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Nhập vào ngày (dd/MM/yyyy): ");

		String inputDate = scanner.nextLine();

		try {

			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

			Date date = dateFormat.parse(inputDate);

			printDateInfo(date);

		} catch (ParseException e) {

			System.out.println("Định dạng ngày không hợp lệ!");

		} finally {

			scanner.close();

		}

	}

	public static void printDateInfo(Date date) {

		Calendar calendar = Calendar.getInstance();

		calendar.setTime(date);

		int dayOfYear = calendar.get(Calendar.DAY_OF_YEAR);

		int daysLeftInYear = calendar.getActualMaximum(Calendar.DAY_OF_YEAR) - dayOfYear;

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

		String formattedDate = dateFormat.format(date);

		System.out.println("Ngày " + formattedDate + " là ngày thứ " + dayOfYear + " trong năm và còn " + daysLeftInYear
				+ " ngày nữa để hết năm.");

		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

		String[] dayNames = { "Chủ nhật", "Thứ hai", "Thứ ba", "Thứ tư", "Thứ năm", "Thứ sáu", "Thứ bảy" };

		int dayOfWeekOfYear = (calendar.get(Calendar.WEEK_OF_YEAR) - 1) * 7 + dayOfWeek;

		int dayOfWeekOfMonth = calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH);

		int daysOfMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

		int daysnumberOfyear = calendar.getActualMaximum(Calendar.DAY_OF_YEAR);

		System.out.println("Ngày " + formattedDate + " là ngày thứ " + dayNames[dayOfWeek - 1] + " thứ "
				+ dayOfWeekOfMonth + " và có " + daysOfMonth + " ngày trong tháng.");

		System.out.println("Năm " + calendar.get(Calendar.YEAR) + " có " + daysnumberOfyear + " ngày ");

	}

}
