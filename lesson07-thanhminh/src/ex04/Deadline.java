package ex04;

import java.util.Calendar;
import java.util.Locale;

import util.DateUtils;

public class Deadline {
	public static void main(String[] args) {
		Locale locale = new Locale("en", "US");
		Calendar c = Calendar.getInstance();
		c.set(2022, Calendar.JUNE, 7);
		
		Calendar projectDeadline = calDeadline(c, 110);
		System.out.println("Nhóm A phải bàn giao sản phẩm cho khách hàng B vào ngày: " + DateUtils.format(projectDeadline, locale));		
	}
	private static Calendar calDeadline(Calendar c, int days) {
		Calendar deadline = (Calendar) c.clone();
		int daysToAdd = days;
		while (daysToAdd > 0) {
            deadline.add(Calendar.DAY_OF_MONTH, 1);
            if (deadline.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY ||
                deadline.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                continue;
            }
            daysToAdd--;
        }
		return deadline;
	}

}
