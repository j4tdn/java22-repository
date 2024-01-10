import java.util.Scanner;
public class Ex02Test {
	

	class Vehicle {
	    private String model;
	    private double price;
	    private double cylinderCapacity;

	    // Constructor
	    public Vehicle(String model, double price, double cylinderCapacity) {
	        this.model = model;
	        this.price = price;
	        this.cylinderCapacity = cylinderCapacity;
	    }

	    // Phương thức tính tiền thuế trước bạ
	    public double calculateTax() {
	        if (cylinderCapacity < 100) {
	            return price * 0.01;
	        } else if (cylinderCapacity >= 100 && cylinderCapacity <= 200) {
	            return price * 0.03;
	        } else {
	            return price * 0.05;
	        }
	    }

	    // Phương thức để hiển thị thông tin của xe
	    public void displayInfo() {
	        System.out.println("Model: " + model);
	        System.out.println("Price: " + price);
	        System.out.println("Cylinder Capacity: " + cylinderCapacity);
	        System.out.println("Tax Amount: " + calculateTax());
	    }
	}

	public class Main {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Nhập số lượng xe: ");
	        int numberOfVehicles = scanner.nextInt();
	        scanner.nextLine(); // Đọc kí tự thừa sau khi nhập số lượng xe

	        Vehicle[] vehicles = new Vehicle[numberOfVehicles];

	        // Nhập thông tin cho từng xe
	        for (int i = 0; i < numberOfVehicles; i++) {
	            System.out.println("Nhập thông tin cho xe thứ " + (i + 1) + ":");
	            System.out.print("Model: ");
	            String model = scanner.nextLine();
	            System.out.print("Price: ");
	            double price = scanner.nextDouble();
	            System.out.print("Cylinder Capacity: ");
	            double cylinderCapacity = scanner.nextDouble();

	            
	            scanner.nextLine(); // Đọc kí tự thừa sau khi nhập dung tích xy lanh
	        }

	        // Xuất thông tin và tiền thuế trước bạ của từng xe
	        System.out.println("Bảng kê khai tiền thuế trước bạ của các xe:");
	        for (int i = 0; i < numberOfVehicles; i++) {
	            System.out.println("Xe thứ " + (i + 1) + ":");
	            vehicles[i].displayInfo();
	            System.out.println();
	        }

	        scanner.close();
	    }
	}


}
