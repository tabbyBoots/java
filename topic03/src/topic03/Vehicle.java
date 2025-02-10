package topic03;

public class Vehicle {
	
	// initial value
		private int wheel = 4;
		private int door = 4;
		private String brand = "Honda";
	
	// Constructor
	public Vehicle() {}

	public Vehicle(int wheel) {
		this.wheel = wheel;
	}

	public Vehicle(String brand) {
		this.brand = brand;
	}

	public Vehicle(int wheel, String brand) {
		this.wheel = wheel;
		this.brand = brand;
	}

	// Method overlording

	void print() {
		System.out.println();
		System.out.printf("Wheel: %d%n", wheel);
		System.out.printf("Brand: %s%n%n", brand);
	}

	void print(int wheel) {
		System.out.printf("Wheel: %d%n", wheel);
	}

	void print(String brand) {
		System.out.printf("Brand: %s%n%n", brand);
	}

	// Getter and Setter
	public int getWheel() {
		return wheel;
	}

	public void setWheel(int wheel) {
		if (wheel >= 2 && wheel < 10) {
			this.wheel = wheel;
		}
	}

	public int getDoor() {
		return door;
	}

	public void setDoor(int door) {
		if (door >= 2 && door < 10) {
			this.door = door;
		}
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
}
