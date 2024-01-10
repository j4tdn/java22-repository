package bai2;

public class Item {
	private String id;
	private String name;
	private double xylanh;
	private double value;
public Item() {
	
}
public Item(String id, String name, int xylanh, double value) {
	super();
	this.id = id;
	this.name = name;
	this.xylanh = xylanh;
	this.value = value;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getXylanh() {
	return xylanh;
}
public void setXylanh(int xylanh) {
	this.xylanh = xylanh;
}
public double getValue() {
	return value;
}
public void setValue(double value) {
	this.value = value;
}
@Override
public String toString() {
	return "Item [id=" + id + ", name=" + name + ", xylanh=" + xylanh + ", value=" + value + "]";
}



}
