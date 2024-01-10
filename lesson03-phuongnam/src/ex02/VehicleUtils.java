package ex02;

import java.util.Scanner;

public class VehicleUtils {

	public static void Input(Vehicle car) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập mã xe: ");
		car.setId(sc.nextLine());

		System.out.print("Nhập tên chủ xe: ");
		car.setOwner(sc.nextLine());

		System.out.print("Nhập tên loại xe: ");
		car.setType(sc.nextLine());

		System.out.print("Nhập dung tích xe: ");
		car.setCapacity(sc.nextInt());
		sc.nextLine();

		System.out.print("Nhập trị giá xe: ");
		car.setCost(sc.nextDouble());
		sc.nextLine();

	}

	public static void Print(Vehicle[] car) {
		int n = car.length;
		System.out.println(" Chủ sở hữu " + "    " + " Loại xe " + "    " + " Dung tích " + "    " + " Trị giá "
				+ "    " + " Thuế phải nộp ");
		System.out.println(
				"==================================================================================================================");

		for (int i = 0; i < n; i++) {
			if (car[i].getCapacity() < 100) {
				System.out.println("      " + car[i].getOwner() + "      " + car[i].getType() + "    "
						+ car[i].getCapacity() + "    " + car[i].getCost() + "    " + car[i].getCost() * 0.01);
			}
			if (car[i].getCapacity() >= 100 && (car[i].getCapacity() <= 200)) {
				System.out.println("      " + car[i].getOwner() + "      " + car[i].getType() + "    "
						+ car[i].getCapacity() + "    " + car[i].getCost() + "    " + car[i].getCost() * 0.03);

			}
			if (car[i].getCapacity() > 200) {
				System.out.println("      " + car[i].getOwner() + "      " + car[i].getType() + "    "
						+ car[i].getCapacity() + "    " + car[i].getCost() + "    " + car[i].getCost() * 0.05);

			}

		}
	}

}
