package date27oct;
//base class Vehicle
class Vehicle {
	// Vehicle Attributes
	private String make, model;
	private int year, maxSpeed;

	// Constructor to initialize the attributes
	public Vehicle(String make, String model, int year, int maxSpeed) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.maxSpeed = maxSpeed;
	}

	// method to be overridden by child class
	void drive() {
		System.out.println("The vehicle is moving");
	}

	public String getMake() {
		return make;
	}

	public String getModel() {
		return model;
	}

	public int getYear() {
		return year;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

}

//derived class class Car 
class Car extends Vehicle {
	// call the super function to send the data to be
	// initialized in the base class
	public Car(String make, String model, int year, int maxSpeed) {
		super(make, model, year, maxSpeed);
	}

	// over ride the drive class to have car info
	@Override
	void drive() {
		System.out.println(super.getMake() + " " + super.getModel() + " Car is driving");
	}

	// over ride the toString method to display the care details
	@Override
	public String toString() {
		return "Car-details:\nMake car:"+this.getMake()+"\nModel of car:"+this.getModel()+"\nYear of manufacture:"+this.getYear()+"\n maximum Speed:"
	+this.getMaxSpeed();
	}

}

//Derived class Bike 
class Bike extends Vehicle {
	// Call the super function again to initailize the attributes
	// with bike values
	public Bike(String make, String model, int year, int maxSpeed) {
		super(make, model, year, maxSpeed);
	}

	// over ride the drive to get bike info
	@Override
	void drive() {
		System.out.println(super.getMake() + " " + super.getModel() + " Bike is driving ");
	}

	// over ride the getString method to
	// display the bike details
	@Override
	public String toString() {
		return "Bike-details:\n Make bike:"+ this.getMake() + "\n Model of bike: " + this.getModel()+ "\n Year of manufacture: " + this.getYear() 
		+ "\n maximum Speed: " + this.getMaxSpeed();
	}
}
//main class
public class InheritanceProgram {
	// main method
	public static void main(String[] args) {
		// Create a Car object
		Car c = new Car("Ambassador", "hindustan", 1999, 120);
		// Create a Bike object
		Bike b = new Bike("TVS", "scooty", 2020, 100);
		// call the car.drive method so that car
		c.drive();
		// print the car details
		System.out.println(c);
		// call the bike.drive method so that bike
		b.drive();
		// print the Bike details
		System.out.println(b);
	}
}