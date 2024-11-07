package date04nov;

import java.util.Scanner;

public class OddEvenCounter {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
	        int oddCount=0;
	        int evenCount=0;
	        
	        while(true){
	        	System.out.print("Enter a number(-1 to exit):");
	        	int num = scanner.nextInt();
	            
//	        	checking if the input is -1
	        	if(num==-1) {
	                break;
	            }
	            
//	            checking if the number is even or odd
	            if(num%2==0) {
	                evenCount++;
	            }
	            else{
	                oddCount++;
	            }
	        }
	        
//	        display the results
	        System.out.println("Total even numbers:"+evenCount);
	        System.out.println("Total odd numbers:"+oddCount);
	        
	        scanner.close();
	    }
	}

