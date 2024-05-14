package collection_ex.listexample;

import java.util.ArrayList;

public class Arraylist_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <String> al = new ArrayList<>();
		al.add("xyz");
		al.add("abc");
		al.add("xyz");
		al.add("xyz1");
		System.out.println(al);
		System.out.println(al.get(2));
		al.remove(2);
		System.out.println(al);
	}

}
