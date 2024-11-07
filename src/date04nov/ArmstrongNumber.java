package date04nov;

import java.util.Scanner;

public class ArmstrongNumber{
	
//	method to print armstrong number
	public static void printArmstrongNum(int start, int end){
		System.out.println("Armstrong numbers between "+start+" and "+end+" are:");
		
		for (int i=start;i<=end;i++){
			if (isArmstrong(i)) {
				System.out.println(i);
		    }
	    }
    }

//	method to check number is a armstrong no
	public static boolean isArmstrong(int num){
		int originalNum=num;
		int res=0;//considering result as res
		
		while (num>0) {
			int digit=num%10;
			res+=cube(digit); //add cube of each digit
			num/=10;
	    }

		return res==originalNum;
	 }

//	method to calculate the cube of a number without using inbuilt function math.pow()
	public static int cube(int n) {
		return n*n*n;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

//		taking input from the user
		System.out.print("Enter the start of the range:");
		int start = scanner.nextInt();

		System.out.print("Enter the end of the range:");
		int end = scanner.nextInt();

//		printing Armstrong number
		printArmstrongNum(start,end);

		scanner.close();
	 }
}