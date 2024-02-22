package Ex04;

public class Staff extends Manager {
    private TruongPhong truongPhong;

    public Staff() {
        // TODO Auto-generated constructor stub
    }

    public Staff(String name, String date, double coefficientsSalary, TruongPhong truongPhong) {
        super(name, date, coefficientsSalary, 0); // hệ sốc chức vụ của nhân viên bằng 0
        this.truongPhong = truongPhong;
    }

    @Override
    public String toString() {
        return super.toString() + ", NhanVien [TruongPhong=" + truongPhong + "]";
    }

    public TruongPhong getTruongPhong() {
        return truongPhong;
    }

    public void setTruongPhong(TruongPhong truongPhong) {
        this.truongPhong = truongPhong;
    }
    public double tinhLuong() {
        return (getCoefficientsSalary() + getPositionCoefficient()) * 1250000;
    }
}