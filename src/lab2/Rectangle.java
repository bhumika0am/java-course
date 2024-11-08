package lab2;
/*Assignment-1. 
Write a Java program that uses a method to calculate the area of a rectangle and compare them using 
Relational Operator Steps: 
● Create a class Rectangle. 
● The Rectangle class should have two attributes length and width of type int. 
● Create a constructor that accepts length and width as parameters. 
● Area should be calculated as length*area. 
● Instantiate two Rectangle classes with random values. 
● Compare the areas of the two rectangles using the Relational Operator. 
● If the first one is bigger than the second one, print “Rectangle1 > Rectangle2”. 
● If the first one is smaller print “Rectangle1 < Rectangle2”. 
● Otherwise print “They are equal”.*/
public class Rectangle {
	int length=23;
	int width=67;
	public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
	}
        public int calculateArea() {
            return length * width;
        }     
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(3,2);
		Rectangle r2 = new Rectangle(1,6);
		int area1 = r1.calculateArea();
		int area2 = r2.calculateArea();
		if(area1>area2){
	       System.out.println("rectangle1>rectangle2");
	      }
		else if(area1<area2){
	      System.out.println("rectangle1<rectangle2");
	      }
		else{
	     System.out.println("They are equal");
	      }
	}
}
