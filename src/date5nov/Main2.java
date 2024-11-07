package date5nov;

import java.util.Scanner;

//super class Animal
class Animal {
//    method to be overridden by subclasses
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

//subclass Dog
class Dog extends Animal {
    @Override
    public void makeSound() {//override method makeSound
        System.out.println("The dog barks");
    }
}

//subclass Cat
class Cat extends Animal {
    @Override
    public void makeSound() {//override method  makeSound
        System.out.println("The cat meows");
    }
}

//main class(entry point of program)
public class Main2 {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

//	        object creation
	        Animal animal = new Animal();
	        Dog dog = new Dog();
	        Cat cat = new Cat();

//	        menu driven block to allow user to choose which object to display
	        System.out.println("Choose an animal:\n1.Animal\n2.Dog\n3.Cat");
	        int choice = scanner.nextInt();

//	        display sound based on user choice
	        switch (choice) {
	            case 1:
	                animal.makeSound();
	                break;
	            case 2:
	                dog.makeSound();
	                break;
	            case 3:
	                cat.makeSound();
	                break;
	            default:
	                System.out.println("Invalid choice.");
	                break;
	        }

	        scanner.close();
	    }
}