package MethodOverloading3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Bill bill=new Bill();
		bill.findPrice(1004);
		
		bill.findPrice("Reebok","T-shirt", 34);

	}

}
