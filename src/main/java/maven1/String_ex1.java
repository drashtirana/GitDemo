package maven1;

public class String_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	String fname ="dev";
	String lname ="rana";
	String fullname=fname+lname;
	System.out.println(fullname);
	
	int lenght = fullname.length();
	System.out.println(lenght);
	
	char fchar =fullname.charAt(0);
	char lchar =fullname.charAt(lenght-1);
	System.out.println(fchar);
	System.out.println(lchar);
	
	String subString = fullname.substring(0,5);
	System.out.println(subString);
	
	String othername="devrana";
	
	boolean equal =fullname.equals(othername);
	boolean same =fullname.equalsIgnoreCase(othername);
	System.out.println(equal);
	System.out.println(same);
	
	String uppercase =fullname.toUpperCase();
	System.out.println(uppercase);
	
	String lowercase =fullname.toLowerCase();
	System.out.println(lowercase);
	
	boolean contains = fullname.contains("rana");
	System.out.println(contains);
	boolean contain = fullname.contains("xyz");
	System.out.println(contain);
	 String[]split = fullname.split("v");
	 System.out.println(split[0]);
 	// System.out.println(split[1]);
		
		
	
	
	
	
	
	
	
	
	}

}
