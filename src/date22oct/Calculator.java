package date22oct;
import java.util.Scanner;
public class Calculator {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }
    // Method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    // Method to add two double values
    public double add(double a, double b) {
        return a + b;
    }
    // Main method to demonstrate method overloading
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        // Demonstrate the first add() method (two ints)
        System.out.print("Enter first integer: ");
        int int1 = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int int2 = scanner.nextInt();
        int result1 = calculator.add(int1, int2);
        System.out.println("Sum of two integers: " + result1);
        // Demonstrate the second add() method (three ints)
        System.out.print("Enter third integer: ");
        int int3 = scanner.nextInt();
        int result2 = calculator.add(int1, int2, int3);
        System.out.println("Sum of three integers: " + result2);
        // Demonstrate the third add() method (two doubles)
        System.out.print("Enter first double: ");
        double double1 = scanner.nextDouble();
        System.out.print("Enter second double: ");
        double double2 = scanner.nextDouble();
        double result3 = calculator.add(double1, double2);
        System.out.println("Sum of two doubles: " + result3);
        // Close the scanner
        scanner.close();
    }
}
