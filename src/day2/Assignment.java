package day2;

//write a program to find number of upper case,lower case,digits and special character in a given string

public class Assignment {

   public static void main(String args[]){
	  int up=0,low=0,num=0,s= 0;
	  /*assuming up=upper case,low=lower case,num=number and s=special case character*/
	  
	  String str = "Bhumika A.M";
	  
	  for(int i = 0; i < str.length(); i++){
//		  char ch = str.charAt(i);
		  
		  if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
			  //counting the upper case
			  up++;
		  
		  else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
			  //counting the lower case
			  low++;
		  
		  else if (str.charAt(i) >= '0' && str.charAt(i) <= '9')
			  //counting the number
			  num++;
		  
		  else
			  //counting the special character
			  s++;
	   }
	  
	  System.out.println("Upper case letters : "+up);
	  System.out.println("lower case letters : "+low);
	  System.out.println("Number : "+ num);
	  System.out.println("Special characters : "+s);
   }
}      

	    