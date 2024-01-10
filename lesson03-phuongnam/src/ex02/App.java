package ex02;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);
		System.out.println("Mời nhập số lượng --> ");

		int n = Integer.parseInt(ip.nextLine());

		Vehicle[] v = new Vehicle[n];
		for (int i = 0; i < n; i++) {

			System.out.println("Xe thứ " + (i + 1));
			v[i] = new Vehicle();
			VehicleUtils.nhapXe(v[i]);

		}

		VehicleUtils.Print(v);
		System.exit(0);

	}
}
