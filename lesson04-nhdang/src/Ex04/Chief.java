package Ex04;

import java.math.BigDecimal;

public class Chief extends CoreStat{
    private BigDecimal positionPoint;
    private String unit;
	public Chief() {
		
	}
	public Chief(String name, String birthday, BigDecimal salaryPoint, BigDecimal positionPoint, String unit) {
		super(name, birthday, salaryPoint);
		this.positionPoint = positionPoint;
		this.unit = unit;
	}
	public BigDecimal getPositionPoint() {
		return positionPoint;
	}
	public void setPositionPoint(BigDecimal positionPoint) {
		this.positionPoint = positionPoint;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	@Override
	public String toString() {
		return "Trưởng phòng" + super.toString()+"positionPoint=" + positionPoint + ", unit=" + unit + "]";
	}
    
}
