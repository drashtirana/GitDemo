package maven1;

 class Book
{
String title;
int price;
String color;

Book(String title,int price,String color)
{
this.title=title;
this.price=price;
this.color=color;
}
}

 public class Library
{
		long num;
		String add;
		Book b;
		
		Library(long num,String add,Book b)
		{
		this.num=num;
		this.add=add;
		this.b=b;
		}


	public static void main (String[] args)
	{
	
	Book b1 = new Book("Physics",500,"Blue");
	
	Library l1 = new Library(12345678,"Toronto",b1);
	
	System.out.println(l1.add +" "+l1.num);
	System.out.println("book title:" +b1.title);
	System.out.println("book price:" +b1.price);
	System.out.println("book color:" +l1.b.color);
	
	}

	
}
 










