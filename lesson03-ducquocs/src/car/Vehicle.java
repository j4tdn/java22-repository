package car;

public class Vehicle {
    private String nameOfCar;
    private String typeCar;
    private int capacity;
    private Double price;

    @Override
    public String toString() {
        return "Vehicle [nameOfCar=" + nameOfCar + ", typeCar=" + typeCar + ", capacity=" + capacity + ", price="
                + price + "]";
    }

    public String getNameOfCar() {
        return nameOfCar;
    }

    public void setNameOfCar(String nameOfCar) {
        this.nameOfCar = nameOfCar;
    }

    public Vehicle(String nameOfCar, String typeCar, int capacity, Double price) {
        this.nameOfCar = nameOfCar;
        this.typeCar = typeCar;
        this.capacity = capacity;
        this.price = price;
    }

    public String getTypeCar() {
        return typeCar;
    }

    public void setTypeCar(String typeCar) {
        this.typeCar = typeCar;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
