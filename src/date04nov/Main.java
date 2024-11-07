package date04nov;

//base class Vehicle
	class Vehicle {
	    public void start() {
	        System.out.println("Vehicle started.");
	    }
	}

//	subclass Car
	class Car extends Vehicle {
	    @Override
	    public void start() { // Override start method
	        System.out.println("Car started");
	    }
	}

//	subclass Motorcycle
	class Motorcycle extends Vehicle {
	    @Override
	    public void start() {//override start method
	        System.out.println("Motorcycle started.");
	    }
	}

//	garage class with a method to service a vehicle
	class Garage {
	    //method to service a vehicle
	    public void serviceVehicle(Vehicle vehicle) {
	        vehicle.start(); // Call the start method of the provided vehicle
	        System.out.println("Vehicle serviced.");
	    }
	}

	//main class(entry point of program)
public class Main {
	    public static void main(String[] args) {
	    	
//	        instances of car and motorcycle
	        Car car = new Car();
	        Motorcycle motorcycle = new Motorcycle();

//	        instance of garage
	        Garage garage = new Garage();

//	        service the car
	        System.out.println("Servicing Car:");
	        garage.serviceVehicle(car);

//	        service the motorcycle
	        System.out.println("\nServicing Motorcycle:");
	        garage.serviceVehicle(motorcycle);
	        
	    }
}
