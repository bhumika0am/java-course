package lab3;
/*Assignment-2. 
● Write a Java program that demonstrates method overloading by creating a class called Calculator. 
● Add three methods called add(). 
● The first add() method should take two int variables as arguments and return their sum as int. 
● The second add() method should take three int variables as arguments and return their sum as int. 
● The third add() method should take two doubles as arguments and return their sum as double. 
● The program should allow the user to display the results of each method.*/
import java.util.Scanner;
  public class Calculator {
		    public int add(int a, int b) {
		        return a + b;
		    }
		    public int add(int a, int b, int c) {
		        return a + b + c;
		    }
		    public double add(double a, double b) {
		        return a + b;
		    }
		    public static void main(String[] args) {
		        Scanner s = new Scanner(System.in);
		        Calculator calculator = new Calculator();
		        System.out.print("Enter two integers to add: ");
		        int int1 = s.nextInt();
		        int int2 = s.nextInt();
		        System.out.println("Sum of two integers: " + calculator.add(int1, int2));
		        System.out.print("Enter three integers to add: ");
		        int int3 = s.nextInt();
		        s.nextLine();
		        System.out.println("Sum of three integers: " + calculator.add(int1, int2, int3));
		        System.out.print("Enter two double values to add: ");
		        double double1 = s.nextDouble();
		        double double2 = s.nextDouble();
		        System.out.println("Sum of two doubles: " + calculator.add(double1, double2));
		        s.close();
	}

}
