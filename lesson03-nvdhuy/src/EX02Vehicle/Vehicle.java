package EX02Vehicle;

public class Vehicle {
	private String tenchuxe;
	private String loaixe;
	private int dungtich;
	private double trigia;
	
	public Vehicle() {
	
	}

	public Vehicle(String tenchuxe, String loaixe, int dungtich, double trigia) {
		this.tenchuxe = tenchuxe;
		this.loaixe = loaixe;
		this.dungtich = dungtich;
		this.trigia = trigia;
	}

	public String getTenchuxe() {
		return tenchuxe;
	}

	public void setTenchuxe(String tenchuxe) {
		this.tenchuxe = tenchuxe;
	}

	public String getLoaixe() {
		return loaixe;
	}

	public void setLoaixe(String loaixe) {
		this.loaixe = loaixe;
	}

	public int getDungtich() {
		return dungtich;
	}

	public void setDungtich(int dungtich) {
		this.dungtich = dungtich;
	}

	public double getTrigia() {
		return trigia;
	}

	public void setTrigia(double trigia) {
		this.trigia = trigia;
	}
	 public double tinhThue(){
	        double thue;
	        if(dungtich<100) thue=trigia*0.01;
	        else if (dungtich >= 100 && dungtich<=200) thue = trigia * 0.03;
	        else thue = trigia * 0.05;
	        return thue;
	    }

	public String toString() {
		return "Vehicle [tenchuxe=" + tenchuxe + ", loaixe=" + loaixe + ", dungtich=" + dungtich + ", trigia=" + trigia
				+ "]";
	}
	
	
}
