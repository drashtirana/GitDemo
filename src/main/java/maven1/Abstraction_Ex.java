package maven1;

abstract class Shape
{
	String color;

abstract double claculatorarea();
public void setcolor(String color)
{
	this.color=color;
}
}
class Circle extends Shape
{
double radious;
	Circle(String color, double radious)
	{
		this.color=color;
		this.radious= radious;
		
	}
double  claculatorarea()
{
	return Math.PI*radious*radious;
	
}
}
class Square extends Shape
{
	double side;
Square(String color,double side)
{
	this.color=color;
	this.side=side;
}
double claculatorarea()
{
	return side*side;
}
}
public class Abstraction_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle c1 = new Circle("red",1.2);
		Square s1  = new Square("blue",5.5);
		System.out.println("area of circle" +c1.claculatorarea());
		System.out.println("area of Square" +s1.claculatorarea());
		
		
		

	}

}
