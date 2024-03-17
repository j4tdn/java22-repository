package Bai4;

public class GiamDoc extends NhanSu {


	public GiamDoc(String hoten, String ngaySinh, int heSoLuong, int heSoChucVu) {
		super(hoten, ngaySinh, heSoLuong, heSoChucVu);
	}
	


	@Override
	public String toString() {
		return "GiamDoc [getHoten()=" + getHoten() + ", getNgaySinh()=" + getNgaySinh() + ", getHeSoLuong()="
				+ getHeSoLuong() + ", getHeSoChucVu()=" + getHeSoChucVu() + "]";
	}



	@Override
    public float tinhLuong() {
        return (getHeSoLuong() + getHeSoChucVu()) * 3000000;
    }
}
