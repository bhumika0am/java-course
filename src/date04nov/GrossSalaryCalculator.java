package date04nov;

import java.util.Scanner;

public class GrossSalaryCalculator {
	public static double calculateGrossSalary(double basicSalary) {
		
		double hra,da;
		if(basicSalary>15000){
			hra=basicSalary*0.20;
	        da=basicSalary*0.60;
	    }
		else{
			hra=3000;
	        da=basicSalary*0.70;
	    }
		
		return basicSalary+hra+da;
		
     }
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("enter the basic salary of the employee:");
			
			double basicSalary=scanner.nextDouble();
			double grossSalary=calculateGrossSalary(basicSalary);
			
			System.out.println("gross Salary:"+grossSalary);
			System.out.print("enter your choice (-1 to calculate again or any integer value to exit):");
			
			int choice = scanner.nextInt();
			
			if (choice!=-1) {
				break;
	        }
	    }
		
		scanner.close();
		System.out.println("exit");
	 }
}
