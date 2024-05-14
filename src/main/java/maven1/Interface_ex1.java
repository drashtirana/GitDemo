package maven1;

interface soundmaker
{
	void makesound();
}
interface mover
{
	void move();
}
class Children implements soundmaker,mover
{
	public void makesound()
	{
		System.out.println("children are shouting");
	}
	public void move()
	{
		System.out.println("children are playing");
		
	}
}
class Doorbell implements soundmaker
{
	public void makesound()
	{
		System.out.println("bell is ringing");
	}
}
public class Interface_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Children c1 = new Children();
		Doorbell d1 = new Doorbell();
		c1.makesound();
		d1.makesound();
		c1.move();
  
	}

}
