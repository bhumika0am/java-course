package date22oct;
import java.util.Scanner;
public class Car {
    // Attributes of Car class
    private String make;
    private String model;
    private short year;
    private int price;
    // Constructor that initializes the Car object with given parameters
    public Car(String make, String model, short year, int price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }
    // Method to display car details
    public void displayCarDetails() {
        System.out.println("Car Details:");
        System.out.println("Make: " + this.make);
        System.out.println("Model: " + this.model);
        System.out.println("Year: " + this.year);
        System.out.println("Price: $" + this.price);
    }
    // Main method to instantiate Car objects and allow user input
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Prompt the user for car details
        System.out.print("Enter car make: ");
        String make = scanner.nextLine();
        System.out.print("Enter car model: ");
        String model = scanner.nextLine();
        System.out.print("Enter car year: ");
        short year = scanner.nextShort();
        System.out.print("Enter car price: ");
        int price = scanner.nextInt();
        // Create a Car object using the constructor
        Car userCar = new Car(make, model, year, price);
        // Display the car details
        userCar.displayCarDetails();
        // Close the scanner
        scanner.close();
    }
}
