package maven1;

import java.util.*;

public class Scanner_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("enter your name");
		String name = s1.nextLine();
		System.out.println("enter your age");
		int age = s1.nextInt();
		System.out.println("my name is" +name);
		System.out.println("my age is" +age);
		s1.close();
		
		
		
		

	}

}
