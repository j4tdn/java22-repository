package persistence;

public class ClassResult {
	private String ClassName;
	private int countStudenMath;
	private int countStudenLiterature;
	private String StudenName;
	public ClassResult() {
	}
	@Override
	public String toString() {
		return "ClassResult [ClassName=" + ClassName + ", countStudenMath=" + countStudenMath
				+ ", countStudenLiterature=" + countStudenLiterature + ", StudenName=" + StudenName + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public String getClassName() {
		return ClassName;
	}
	public void setClassName(String className) {
		ClassName = className;
	}
	public int getCountStudenMath() {
		return countStudenMath;
	}
	public void setCountStudenMath(int countStudenMath) {
		this.countStudenMath = countStudenMath;
	}
	public int getCountStudenLiterature() {
		return countStudenLiterature;
	}
	public void setCountStudenLiterature(int countStudenLiterature) {
		this.countStudenLiterature = countStudenLiterature;
	}
	public String getStudenName() {
		return StudenName;
	}
	public void setStudenName(String studenName) {
		StudenName = studenName;
	}
	public ClassResult(String className, int countStudenMath, int countStudenLiterature, String studenName) {
		super();
		ClassName = className;
		this.countStudenMath = countStudenMath;
		this.countStudenLiterature = countStudenLiterature;
		StudenName = studenName;
	}
	
}
