package date04nov;

//Student class
class Student {
	String name;
	int age;
	String department;
	
	public Student(){ //default constructor
		this.name="Unknown";
	    this.age=20;
	    this.department="Unassigned";
	 }
	
	public Student(String name,int age) {//parameters constructor
		this.name=name;
		this.age=age;
	    this.department="IT";
	}

	public Student(String name,int age,String department) {
	     this.name=name;
	     this.age=age;
	     this.department=department;
	    }

//display method student details
	public void displayDetails() {
	        System.out.println("Name:"+name+",Age:"+age+",Department:"+department);
	    }
	}

public class Main2 {//entry point of program

	    public static void main(String[] args) {
//	        student instance using default constructor
	        Student student1 = new Student();
	        System.out.println("Student 1 Details:");
	        student1.displayDetails();

//	        student instance using constructor with two parameters
	        Student student2 = new Student("Vaishaka",22);
	        System.out.println("\nStudent 2 Details:");
	        student2.displayDetails();

//	        student instance using constructor with three parameters
	        Student student3 = new Student("Bhumika",21,"Computer Science");
	        System.out.println("\nStudent 3 Details:");
	        student3.displayDetails();
	    }
}

