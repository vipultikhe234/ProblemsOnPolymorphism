package MethodOverloading3;

public class Bill {
	public void findPrice(int itemId) {
		if (itemId == 1001) {
			System.out.println("Price of that item is $25");
		} else if (itemId == 1002) {
			System.out.println("Price of that item is $20");
		} else if (itemId == 1003) {
			System.out.println("Price of that item is $23");
		} else if (itemId == 1004) {
			System.out.println("Price of that item is $18");
		} else {
			System.out.println("Enter valid item id number");
		}
	}

	public void findPrice(String brand, String itemType, int size) {
		if (brand == "Puma") {
			if (itemType == "T-shirt") {
				System.out.println("Price of that item is $25");
			} else if (itemType == "skirt") {
				System.out.println("Price of that item is $20");
			}
		} else if (brand == "Reebok") {
			if (itemType == "T-shirt") {
				System.out.println("Price of that item is $23");
			} else if (itemType == "skirt") {
				System.out.println("Price of that item is $18");
			}
		} else {
			System.out.println("Enter valid brand");
		}
	}
}
