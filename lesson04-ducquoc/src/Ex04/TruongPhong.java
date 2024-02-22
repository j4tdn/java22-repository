package Ex04;

import java.util.ArrayList;
import java.util.List;

public class TruongPhong extends Manager {
    private String unitName;
    private List<Staff> dsNhanVienQuanLy;

    public TruongPhong() {
        // TODO Auto-generated constructor stub
    }

    public TruongPhong(String name, String date, double coefficientsSalary, double positionCoefficient, String unitName) {
        super(name, date, coefficientsSalary, positionCoefficient);
        this.unitName = unitName;
        this.dsNhanVienQuanLy = new ArrayList<>();
    }

    @Override
    public String toString() {
        return super.toString() + ", TruongPhong [UnitName=" + unitName + "]";
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public List<Staff> getDsNhanVienQuanLy() {
        return dsNhanVienQuanLy;
    }

    public void themNhanVienQuanLy(Staff nhanVien) {
        this.dsNhanVienQuanLy.add(nhanVien);
    }

    public double tinhLuong() {
        return (getCoefficientsSalary() + getPositionCoefficient()) * 2200000;
    }
}
