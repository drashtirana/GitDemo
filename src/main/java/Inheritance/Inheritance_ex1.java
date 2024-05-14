package Inheritance;

public class Inheritance_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog d = new Dog("tom");
		Cat c = new Cat("ofiliya");
		d.eat();
		c.sleep();
		d.bark();
		c.meow();
		
		//upcasting
		Animal animalreference = d;
		animalreference.eat();
		
		//downcasting
		Animal subcast =  new Dog("tom");
		Dog myDog = (Dog) subcast;
		myDog.eat();
		myDog.sleep();
		
		

		
	}

}
