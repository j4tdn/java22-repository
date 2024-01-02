package bean;

public class CustomInt {
	public int value;
	
	public CustomInt(int value) {
		this.value = value;
	}
	
	//CustomInt ci1 = new CustomInt (5);
	// sout(ci1);
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		return "" + value;
	}
}
