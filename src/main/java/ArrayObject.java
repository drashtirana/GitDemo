class Student
{
	private String name;
	private int age;
	
	Student(String name,int age)
	{
		this.name=name;
		this.age=age;
		
	}
	public String getname()
	{
		return name;
	}
	public int getage()
	{
		return age;
		
	}
	
}
public class ArrayObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Student[] s = new Student[3];
		  s[0]= new  Student("drashti",20);
		  s[1]= new Student("arti",25);
		  s[2]= new Student("khushi",22);
		  
		  for(int i=0;i<s.length;i++)
		  {
			  System.out.println("name:" +s[i].getname());
			  System.out.println("age:" +s[i].getage());
		  }

	}

}
