package MethodOverloading;

public class Addition {
	int x = 10;
	int y = 20;

	public void add() {
		System.out.println("Addition is : " + (x + y));
	}

	public void add(int x) {
		System.out.println("Addition is : " + (x + x));
	}

	public void add(float x) {
		System.out.println("Addition is : " + (x + x));
	}
}
