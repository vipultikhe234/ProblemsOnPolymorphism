package MethodOverloading2;

public class Student {
	String name = "Unknown";
	int age = 0;
	String address = "Not Available";

	public void info(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void info(int age, String address) {
		this.age = age;
		this.address = address;
	}

	public void info(String name, String address) {
		this.name = name;
		this.address = address;
	}

	public void info(int age, String name, String address) {
		this.age = age;
		this.name = name;
		this.address = address;
	}

	public void info(String name, int age, String address) {
		this.age = age;
		this.name = name;
		this.address = address;
	}

	public void info(String name, String address, int age) {
		this.age = age;
		this.name = name;
		this.address = address;
	}

	public void showInfo() {
		System.out.println("Student Name : " + name);
		System.out.println("Student Age : " + age);
		System.out.println("Student Address : " + address);
	}
}
