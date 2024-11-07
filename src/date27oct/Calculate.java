package date27oct;

//base class Shape abstract class with getArea  
abstract class Shape {
	abstract double getArea();
}

//creating the circle class as inheriting the shape
class Circle extends Shape {

	private double radius;
	// parameterized constructor with one argument

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	@Override
	double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}
}

//inherit Shape class 
class Square extends Shape {
	private double length;

	// constructor for the initializing the length values
	public Square(double length) {
		super();
		this.length = length;
	}

	@Override
	double getArea() {
		return this.length * this.length;
	}
}

//inherites base class Shape
class Rectangle extends Shape {
	// A Rectangle has two attributes width, height
	private double width, height;

	// Constructor to initialize the width and height of the Retangle
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	// Override the getArea method to
	@Override
	double getArea() {
		return this.width * this.height;
	}
}

//main class 
public class Calculate {
	// main method
	public static void main(String[] args) {
		// creating the object of Cirlce class
		Circle c = new Circle(3.2);
		// Creating the object of Square class
		Square s = new Square(5);
		// Creating the object of Rectangel class
		Rectangle r = new Rectangle(2,6);
		System.out.println("Area of Cirle : " + c.getArea());
		System.out.println("Area of Square :" + s.getArea());
		System.out.println("Area of Rectangle : " + r.getArea());

	}
}