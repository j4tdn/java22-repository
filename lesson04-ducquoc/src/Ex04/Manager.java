package Ex04;

public class Manager {
	private String Name;
	private String Date;
	private double CoefficientsSalary;// hệ số lương 
	private double PositionCoefficient;// hệ số chức vụ
	public Manager() {
		// TODO Auto-generated constructor stub
	}
	public Manager(String name, String date, double coefficientsSalary, double positionCoefficient) {
		super();
		Name = name;
		Date = date;
		CoefficientsSalary = coefficientsSalary;
		PositionCoefficient = positionCoefficient;
	}
	@Override
	public String toString() {
		return "Manager [Name=" + Name + ", Date=" + Date + ", CoefficientsSalary=" + CoefficientsSalary
				+ ", PositionCoefficient=" + PositionCoefficient + "]";
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public double getCoefficientsSalary() {
		return CoefficientsSalary;
	}
	public void setCoefficientsSalary(double coefficientsSalary) {
		CoefficientsSalary = coefficientsSalary;
	}
	public double getPositionCoefficient() {
		return PositionCoefficient;
	}
	public void setPositionCoefficient(double positionCoefficient) {
		PositionCoefficient = positionCoefficient;
	}
	public double tinhLuong() {
        return (CoefficientsSalary + PositionCoefficient) * 3000000;
    } 
	
	}

