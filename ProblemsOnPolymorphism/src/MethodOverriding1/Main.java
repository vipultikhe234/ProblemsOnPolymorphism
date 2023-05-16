package MethodOverriding1;

public class Main {
	public static void main(String[] args) {
		Bank1 b1 = new Bank1();
		Bank2 b2 = new Bank2();
		Bank3 b3 = new Bank3();
		b1.getBalance(1000);
		b2.getBalance(1500);
		b3.getBalance(2000);
	}
}
