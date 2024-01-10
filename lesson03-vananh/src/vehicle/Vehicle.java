package vehicle;

public class Vehicle {
    // ten chu xe
    private String nameOwnVehicle;
    // loai xe
    private String typeVehicle;
    // gia xe 
    private double price;
    // dung tich xi lanh
    private int cylinderCapacity;

    public Vehicle() {
    }

    
    
    public Vehicle(String nameOwnVehicle, String typeVehicle, double price, int cylinderCapacity) {
        this.nameOwnVehicle = nameOwnVehicle;
        this.typeVehicle = typeVehicle;
        this.price = price;
        this.cylinderCapacity = cylinderCapacity;
    }

    public String getNameOwnVehicle() {
        return nameOwnVehicle;
    }

    public void setNameOwnVehicle(String nameOwnVehicle) {
        this.nameOwnVehicle = nameOwnVehicle;
    }

    public String getTypeVehicle() {
        return typeVehicle;
    }

    public void setTypeVehicle(String typeVehicle) {
        this.typeVehicle = typeVehicle;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCylinderCapacity() {
        return cylinderCapacity;
    }

    public void setCylinderCapacity(int cylinderCapacity) {
        this.cylinderCapacity = cylinderCapacity;
    }

    
   

    // ham tinh thue phai dong truoc khi mua xe
    public double calculateTax() {
        if (cylinderCapacity < 100) {
            return price * 0.01;
        } else if (cylinderCapacity <= 200) {
            return price * 0.03;
        } else {
            return price * 0.05;
        }
    }

    
    
   

    
}