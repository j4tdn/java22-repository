package p3_builder;

// builder -> mutable
public class RemoteDate {
	
	private int day;
	private int month;
	private int year;
	private int dayOfWeek;
	private int dayOfMonth;
	private int dayOfYear;
	
	private RemoteDate() {
	}
	
	// Khởi tạo đối tượng cho RemoteDate
	// gián tiếp thay vì trực tiếp dùng constructor
	// code đẹp hơn
	public static RemoteDate of() {
		return new RemoteDate();
	}
	
	public static RemoteDate of(int day, int month, int year) {
		return of()
				.withDay(day)
				.withMonth(month)
				.withYear(year);
	}

	// Thay thế setter(return void) bằng with(return this)
	public RemoteDate withDay(int day) {
		this.day = day;
		return this;
	}

	public RemoteDate withMonth(int month) {
		this.month = month;
		return this;
	}

	public RemoteDate withYear(int year) {
		this.year = year;
		return this;
	}

	public RemoteDate withDayOfWeek(int dayOfWeek) {
		this.dayOfWeek = dayOfWeek;
		return this;
	}

	public RemoteDate withDayOfMonth(int dayOfMonth) {
		this.dayOfMonth = dayOfMonth;
		return this;
	}

	public RemoteDate withDayOfYear(int dayOfYear) {
		this.dayOfYear = dayOfYear;
		return this;
	}

	// getter ...
	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	public int getDayOfWeek() {
		return dayOfWeek;
	}

	public int getDayOfMonth() {
		return dayOfMonth;
	}

	public int getDayOfYear() {
		return dayOfYear;
	}

	@Override
	public String toString() {
		return "RemoteDate [day=" + day + ", month=" + month + ", year=" + year + ", dayOfWeek=" + dayOfWeek
				+ ", dayOfMonth=" + dayOfMonth + ", dayOfYear=" + dayOfYear + "]";
	}
	
}
