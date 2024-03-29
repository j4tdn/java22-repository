package common;

public enum Holiday {

	NEW_YEAR_FIRST(1,1),
	NEW_YEAR_SECOND(2,1),
	NEW_YEAR_THIRD(3,1),
	TET_FIRST(29,1),
	TET_SECOND(30,1),
	TET_THIRD(31,1),
	TET_FOURTH(1,2),
	TET_FIFTH(2,2),
	TET_SIXTH(3,2),
	TET_SEVENTH(4,2),
	TET_EIGHTH(5,2),
	TET_NINTH(6,2),
	HUNG_KINGS_1(10,4),
	HUNG_KINGS_2(11,4),
	REUNIFICATION(30,4),
	LABOR_DAY(1,5),
	REUNIFICATION_HOLIDAY(2,5),
	LABOR_HOLIDAY(3,5),
	NATIONAL_DAY_HOLIDAY(1,9),
	NATIONAL_DAY(2,9);
	
	private int day;
	private int month;
	
	private Holiday(int day, int month) {
		this.day = day;
		this.month = month;
	}
	
	public int getDay() {
		return day;
	}
	
	public int getMonth() {
		return month;
	}
}
