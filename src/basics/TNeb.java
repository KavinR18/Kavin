package basics;

import java.util.Scanner;

public class TNeb {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the units");

		int unit = scanner.nextInt();
		double bill = 0;
		int rem = 0;

		if (unit >= 0 && unit <= 100) {
			bill = unit * 0;
			System.out.println("bill is " + bill);
		} else if (unit >= 0 && unit <= 200) {
			rem = unit - 100;
			bill = rem * 1.5;

			System.out.println(bill);
		} else if (unit >= 0 && unit <= 500) {
			rem = unit - 200;
			bill = rem * 3 + 200;
			System.out.println(bill);
		} else if(unit > 500) {
			rem = unit - 500;
			bill = rem * 6.6 + 1730;
			System.out.println(bill);
		}
	}
}
