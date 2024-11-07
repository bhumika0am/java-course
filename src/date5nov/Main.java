package date5nov;

//Abstract class Shape
	abstract class Shape{
//	    method to calculate area
	    abstract double calculateArea();
	}

//	subclass Circle
	class Circle extends Shape {
	    private double radius;
	    
	    public Circle(double radius) {// parameterised constructor
	        this.radius=radius;
	    }
	    
	    @Override
	    double calculateArea() {//calculate area of circle 
	        return Math.PI*radius*radius;
	    }
	}

//	subclass Rectangle
	class Rectangle extends Shape {
	    private double length;
	    private double width;

	    
	    public Rectangle(double length,double width) {// parameterised Constructor
	        this.length=length;
	        this.width=width;
	    }

	    @Override
	    double calculateArea() {//calculateArea for Rectangle
	        return length*width;
	    }
	}

	// Main class(entry point of program)
public class Main {
	
	    public static void main(String[] args) {
//	        object of Circle with radius 2
	        Shape c=new Circle(5);
	        System.out.println("area of circle:"+c.calculateArea());

//	        object of rectangle with length and width 3 and 6 respectively
	        Shape r=new Rectangle(4,6);
	        System.out.println("area of rectangle:"+r.calculateArea());
	    }
	}
