package maven1;

abstract class School{
	
	String name;
	int age;
abstract void study();

public void read()
{
    System.out.println("students are reading book");
}
}

class Student1 extends School{
	
Student1(String name,int age)
{
	this.name=name;
	this.age=age;
}

public void study()
{
    System.out.println("Students are writing");
}
}
 
class Student2 extends School{
	
Student2(String name,int age)
{
	this.name=name;
	this.age=age;
}

public void study()
{
    System.out.println("students are doing classwork");
}
}

 public class Abstract_asignment{
 public  static void main(String[] args)
 {
 
	 School s1 = new Student1("abc",20);
	 School s2 = new Student2("xyz",15);
	       
	 System.out.println(s1.name +" is " +s1.age + " year old ");
	 System.out.println(s2.name +" is " +s2.age +" year old ");
	 
	 s1.study();
	 s2.read();
	 s2.study();
 }
 }
 
 























