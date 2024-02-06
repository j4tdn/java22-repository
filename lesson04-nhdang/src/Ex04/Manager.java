package Ex04;
import java.math.BigDecimal;
public class Manager extends CoreStat{
    private BigDecimal positionPoint;
    public Manager() {
    	
    }
	public Manager(String name, String birthday, BigDecimal salaryPoint, BigDecimal positionPoint) {
		super(name, birthday, salaryPoint);
		this.positionPoint = positionPoint;
	}
	public BigDecimal getPositionPoint() {
		return positionPoint;
	}
	public void setPositionPoint(BigDecimal positionPoint) {
		this.positionPoint = positionPoint;
	}
	@Override
	public String toString() {
		return "Giám đốc" + super.toString() + "positionPoint=" + positionPoint + "]";
	}
	
}
