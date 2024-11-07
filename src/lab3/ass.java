package lab3;
import java.util.Scanner;

public class ass {
	    // Method 1: Adds two integers
	    public int add(int a, int b) {
	        return a + b;
	    }

	    // Method 2: Adds three integers
	    public int add(int a, int b, int c) {
	        return a + b + c;
	    }

	    // Method 3: Adds two doubles
	    public double add(double a, double b) {
	        return a + b;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Calculator calculator = new Calculator();

	        // Using the first add method
	        System.out.print("Enter two integers to add: ");
	        int int1 = scanner.nextInt();
	        int int2 = scanner.nextInt();
	        System.out.println("Sum of two integers: " + calculator.add(int1, int2));

	        // Using the second add method
	        System.out.print("Enter three integers to add: ");
	        int int3 = scanner.nextInt();
	        System.out.println("Sum of three integers: " + calculator.add(int1, int2, int3));

	        // Using the third add method
	        System.out.print("Enter two double values to add: ");
	        double double1 = scanner.nextDouble();
	        double double2 = scanner.nextDouble();
	        System.out.println("Sum of two doubles: " + calculator.add(double1, double2));

	        scanner.close();
	    }
	}

}
