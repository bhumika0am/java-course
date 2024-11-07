package day1.operatior;

public class Unary {

	public static void main(String[] args) {

		int a=10;
		int b=a++;
		System.out.println(a+" "+b);
		
		int c=20;
		int d=++c;
		System.out.println(c+" "+d);
		
		int e=5;
		e++;
		System.out.println("e: "+e);
		++e;
		System.out.println("e: "+e);
		
		e--;
		System.out.println("e: "+e);
		--e;
		System.out.println("e: "+e);
		System.out.println("------------------------------");
	
		
		int f=10;
		int g=f++ + ++f + f++ + ++f - f-- + --f;
		System.out.println(f+" "+g);
	}

}
