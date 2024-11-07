package date22oct;
class Animal {
	 // Method to be overridden in subclasses
	 public void makeSound() {
	     System.out.println("The animal makes a sound.");
	 }
	}

	//Subclass Dog that overrides the makeSound() method
	class Dog extends Animal {
	 @Override
	 public void makeSound() {
	     System.out.println("The dog barks.");
	 }
	}
	//Subclass Cat that overrides the makeSound() method
	class Cat extends Animal {
	 @Override
	 public void makeSound() {
	     System.out.println("The cat meows.");
	 }
	}
//Main class to demonstrate method overriding
public class Main {
 public static void main(String[] args) {
     // Creating objects of Dog and Cat classes
     Animal dog = new Dog();
     Animal cat = new Cat();
     // Display the sounds made by each animal
     System.out.print("Dog:");
     dog.makeSound();  // Calling makeSound() method
     System.out.print("Cat:");
     cat.makeSound();  // Calling makeSound() method
 }
}