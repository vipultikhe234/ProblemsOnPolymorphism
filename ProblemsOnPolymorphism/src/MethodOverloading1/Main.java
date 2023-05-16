package MethodOverloading1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number");
		double num1 = sc.nextDouble();
		System.out.println("Enter 2st number");
		double num2 = sc.nextDouble();

		AreaOfRectangle area = new AreaOfRectangle();
		System.out.println("Area Of rectangle is : " + area.areaOfrect(num1, num2));

	}

}
