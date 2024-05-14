package maven1;

public class Accessmodifier_ex1 {
	static String examplestatic = "this is static";
	public String  examplepublicfield = "this is a public field";
	private String  exampleprivatefield = "this is a private field";
	protected String exampleprotectedfield = "this is a protected field";
	String  exampledefaultfield = "this is the default field";
		
	
	public void examplepublic()
	{
		System.out.println("this is a public method");
		
	}
	static void examplestatic()
	{
		System.out.println("this is a static method");
	}
	private void exampleprivate()
	{
		System.out.println("this is a private method");
	}
	protected void exampleprotected()
	{
		System.out.println("this is a protected method");
	}
	void exampledefault() {
		System.out.println("this is a default method");
	}
	
}
