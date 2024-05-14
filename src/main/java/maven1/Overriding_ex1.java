package maven1;
	
class Bird
{
	void sound() 
	{
		System.out.println("generic bird sound");
	}
}
class Parrot extends Bird
{
	void sound()
	{
		System.out.println("parrot making sound");
	}
}
class Crow extends Bird
{
	void sound()
	{
		System.out.println("crow sound");
	}
}
	
public class Overriding_ex1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 Bird b1 = new Parrot();
		 Bird b2 = new Crow();
		 Bird b3 = new Bird();
		 b1.sound();
		 b2.sound();
		 b3.sound();
		 
		 
		 
		 
	}

}
