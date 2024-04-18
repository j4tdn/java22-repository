package p3_builder;

public class RemoteTime {
	
	private int hour ;
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


	public RemoteTime withHour(int hour) {
		if (this.hour == hour) {
			return this;
		}
		
		RemoteTime newInstance = new RemoteTime(this);
		newInstance.hour = hour;
		return newInstance;
	}


	public RemoteTime withMinute(int minute) {
		if (this.hour == minute) {
			return this;
		}
		
		RemoteTime newInstance = new RemoteTime(this);
		newInstance.minute = minute;
		return newInstance;
	}


	public RemoteTime withSecond(int second) {
		if (this.hour == second) {
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
