package maven1;

public class Overloading_ex1 {

int add(int a,int b, int c)
{
	return(a+b+c);
}
int add(int a, int b)
{
	return(a+b);
}
double add(double a,double b)
{
	return (a+b);
}
int add(int a, double b)
{
	return (int) (a+b);
}
double add(int a, double b, int c)
{
	return  (a+b+c);
}
public static void main(String[] args)
{
	Overloading_ex1 e = new Overloading_ex1();
	System.out.println(e.add(20, 30, 20));
	System.out.println(e.add(2, 5));
	System.out.println(e.add(2.5, 2.5));
	System.out.println(e.add(5, 2.5,15));
	
	
}
}

