package lab3;

import java.util.Scanner;
/*Assignment-1. 
● Write a Java program named Car 
● The Car class should have the following attributes: make (String), model (String) ,
year (short) , and price(int) . 
● The car class should have a constructor that takes all the attributes. 
● Add a main method to instantiate car objects. 
● The program should allow the user to create and display objects of each Car Class.  */
public class Car {
	String make;
	String model;
	short year;
	int price;
	public Car(String make, String model, short year, int price) {
        this.make=make;
        this.model=model;
        this.year=year;
        this.price=price;
    }
    public void carDetails() {
        System.out.println("make:"+make);
        System.out.println("model:"+model);
        System.out.println("year:"+year);
        System.out.println("price:"+price);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("enter the car make: ");
        String make = s.nextLine();
        System.out.print("enter the car model: ");
        String model = s.nextLine();
        System.out.print("enter the car year: ");
        short year = s.nextShort();
        System.out.print("enter the car price: ");
        int price = s.nextInt();
        Car car = new Car(make, model, year, price);
        System.out.println("enter the details car Details:");
        car.carDetails();
        s.close();
    }
}
