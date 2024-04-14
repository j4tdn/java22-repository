package p3_builder;

// builder --> immutable
public class RemoteTime {

	private int hour;
	private int minute;
	private int second;
	
	private RemoteTime() {
	}
	private RemoteTime(RemoteTime thisTime) {
		this.hour = thisTime.hour;
		this.minute = thisTime.minute;
		this.second = thisTime.second;
	}
	
	public static RemoteTime of() {
		return new RemoteTime();
	}

	// RemoteTime time3 = RemoteTime.of().withHour(10).withMinute(10).withSecond(10);
	// time3.withHour(15);
	public RemoteTime withHour(int hour) {
		if(this.hour == hour) {
			return this;
		}
		// Gán giá trị của các thuộc tính từ this sang đối tượng mới
		RemoteTime newInstance = new RemoteTime(this);
		// cập nhật giá trị mới của thuộc tính cần setter
		newInstance.hour = hour;
		return newInstance;
	}

	public RemoteTime withMinute(int minute) {
		if(this.minute == minute) {
			return this;
		}
		RemoteTime newInstance = new RemoteTime(this);
		newInstance.minute = minute;
		return newInstance;
	}

	public RemoteTime withSecond(int second) {
		if(this.second == second) {
			return this;
		}
		RemoteTime newInstance = new RemoteTime(this);
		newInstance.second = second;
		return newInstance;
	}

	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public int getSecond() {
		return second;
	}

	@Override
	public String toString() {
		return "RemoteTime [hour=" + hour + ", minute=" + minute + ", second=" + second + "]";
	}
	
	
}
