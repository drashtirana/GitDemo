package maven1;

public class Accessmodifier_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Accessmodifier_ex1  ex1= new Accessmodifier_ex1();
		
		System.out.println( "static field" +ex1.examplestatic);
		ex1.examplestatic();
		
		
		System.out.println("public field:" +ex1.examplepublicfield);
		ex1.examplepublic();
		
		System.out.println("protected:" +ex1.exampleprotectedfield);
		ex1.exampleprotected();

		System.out.println("default field" +ex1.exampledefaultfield);
		ex1.exampledefault();
		
//System.out.println("private field:" +ex1.exampleprivatefield);
//		ex1.exampleprivate();
		
		

	}

}
