package Bai2;

public class Vehicle {
	private String TenChuXe;
	private String LoaiXe;
	private int DungTich;
	private double Gia;
	
	public Vehicle() {
		
	}

	public Vehicle(String tenChuXe, String loaiXe, int dungTich, double gia) {
		TenChuXe = tenChuXe;
		LoaiXe = loaiXe;
		DungTich = dungTich;
		Gia = gia;
	}

	public String getTenChuXe() {
		return TenChuXe;
	}

	public void setTenChuXe(String tenChuXe) {
		TenChuXe = tenChuXe;
	}

	public String getLoaiXe() {
		return LoaiXe;
	}

	public void setLoaiXe(String loaiXe) {
		LoaiXe = loaiXe;
	}

	public int getDungTich() {
		return DungTich;
	}

	public void setDungTich(int dungTich) {
		DungTich = dungTich;
	}

	public double getGia() {
		return Gia;
	}

	public void setGia(double gia) {
		Gia = gia;
	}

	@Override
	public String toString() {
		return "Vehicle [TenChuXe=" + TenChuXe + ", LoaiXe=" + LoaiXe + ", DungTich=" + DungTich + ", Gia=" + Gia + "]";
	}
	
	
}
