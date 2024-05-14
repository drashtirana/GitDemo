package maven1;

public class String_ex2 {
	public static void main(String[] args) {
		
		String fname = "drashti";
		String lname = "rana";
		String fullname = fname+lname;
		System.out.println(fullname);
		
		int length = fullname.length();
		System.out.println(length);
		
		char fchar = fullname.charAt(0);
		System.out.println(fchar);
		
		char lchar = fullname.charAt(length-2);
		System.out.println(lchar);
		
		String othername ="drashtirana";
		
		boolean equal = fullname.equals(othername);
		boolean same = fullname.equalsIgnoreCase(othername);
		System.out.println(equal);
		System.out.println(same);
		
		String SubString = fullname.substring(0,6);
		System.out.println(SubString);
		
		String uppercase = fullname.toUpperCase();
		String lowercase = fullname.toLowerCase();
		System.out.println(uppercase);
		System.out.println(lowercase);
		
		boolean contains = fullname.contains("shti");
		boolean contain = fullname.contains("abc");
		System.out.println(contains);
		System.out.println(contain);
	
		String split[] = fullname.split("a");
		System.out.println(split[0]);
		System.out.println(split[1]);
		
		
		
		
		
		
		
	}

}
