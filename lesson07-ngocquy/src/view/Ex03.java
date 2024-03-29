package view;

import util.DateUtils;
import common.WKD_EGVN;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class Ex03 {
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		Ex03 program = new Ex03();

		int choice;
		boolean exit = false;

		while (!exit) {
			System.out.println("----- MENU -----");
			System.out.println("1. Xem thời gian hiện tại");
			System.out.println("2. In ngày cuối cùng của tháng hiện tại");
			System.out.println("3. Xem ngày đầu tiên và cuối cùng của tuần hiện tại");
			System.out.println("4. Xem ngày hiện tại đang ở tuần thứ mấy trong năm");
			System.out.println("5. Kiểm tra sau 20 ngày nữa là ngày nào, thứ mấy");
			System.out.println("6. Nhập vào ngày tháng năm sinh và kiểm tra số ngày đã sống");
			System.out.println("0. Thoát");
			System.out.print("Nhập lựa chọn của bạn: ");
			choice = ip.nextInt();

			switch (choice) {
			case 1:
				program.getCurrentTime();
				break;
			case 2:
				program.printLastDayOfMonth();
				break;
			case 3:
				program.printFirstAndLastDayOfWeek();
				break;
			case 4:
				program.printCurrentWeekOfYear();
				break;
			case 5:
				program.printDateAfterTwentyDays();
				break;
			case 6:
				program.calculateDaysAlive(ip);
				break;
			case 0:
				exit = true;
				System.out.println("Đã thoát chương trình.");
				break;
			default:
				System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
			}
		}

		ip.close();
	}

	public void getCurrentTime() {
		Calendar current = Calendar.getInstance();
		String currentTime = DateUtils.format(current, "dd/MM/yyyy HH:mm:ss", Locale.getDefault());
		System.out.println("Thời gian hiện tại: " + currentTime);
	}

	public void printLastDayOfMonth() {
		Calendar lastDayOfMonth = Calendar.getInstance();
		lastDayOfMonth.set(Calendar.DAY_OF_MONTH, lastDayOfMonth.getActualMaximum(Calendar.DAY_OF_MONTH));
		String lastDay = DateUtils.format(lastDayOfMonth, "dd/MM/yyyy", Locale.getDefault());
		System.out.println("Ngày cuối cùng của tháng hiện tại: " + lastDay);
	}

	public void printFirstAndLastDayOfWeek() {
		Calendar firstDayOfWeek = Calendar.getInstance();
		firstDayOfWeek.set(Calendar.DAY_OF_WEEK, firstDayOfWeek.getFirstDayOfWeek());
		String firstDay = DateUtils.format(firstDayOfWeek, "dd/MM/yyyy", Locale.getDefault());

		Calendar lastDayOfWeek = DateUtils.clone(firstDayOfWeek);
		lastDayOfWeek.add(Calendar.DAY_OF_WEEK, 6);
		String lastDay = DateUtils.format(lastDayOfWeek, "dd/MM/yyyy", Locale.getDefault());

		System.out.println("Ngày đầu tiên của tuần: " + firstDay);
		System.out.println("Ngày cuối cùng của tuần: " + lastDay);
	}

	public void printCurrentWeekOfYear() {
		Calendar current = Calendar.getInstance();
		int weekOfYear = current.get(Calendar.WEEK_OF_YEAR);
		System.out.println("Ngày hiện tại đang ở tuần thứ " + weekOfYear + " trong năm.");
	}

	public void printDateAfterTwentyDays() {
		Calendar current = Calendar.getInstance();
		current.add(Calendar.DAY_OF_MONTH, 20);
		String dateAfterTwentyDays = DateUtils.format(current, "dd/MM/yyyy", Locale.getDefault());
		int dayOfWeekInt = current.get(Calendar.DAY_OF_WEEK);
		String dayOfWeek = WKD_EGVN.values()[dayOfWeekInt - 1].getVnText();
		System.out.println("Ngày sau 20 ngày là: " + dateAfterTwentyDays + ", " + dayOfWeek);
	}

	public void calculateDaysAlive(Scanner ip) {
		System.out.println("Nhập ngày tháng năm sinh (dd/MM/yyyy): ");
		String dobStr = ip.next();
		Calendar dob = DateUtils.toCalendar(dobStr, "dd/MM/yyyy");
		Calendar current = Calendar.getInstance();
		long differenceInMillis = current.getTimeInMillis() - dob.getTimeInMillis();
		long differenceInDays = differenceInMillis / (1000 * 60 * 60 * 24);
		System.out.println("Bạn đã sống được " + differenceInDays + " ngày.");
	}
}
