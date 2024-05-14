package Inheritance;

class Cat extends Animal
{

	Cat(String name)
	{
		super(name);
		
	}
	void meow()
	{
		System.out.println(name+ "is making noise");
	}

}
