package collection_ex.listexample;

import java.util.LinkedList;

public class Linkedlist_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList <String> l1 = new LinkedList<>();
		l1.add("apple");
		l1.add("banana");
		l1.add("orange");
		System.out.println(l1);
		l1.addFirst("graps");
		System.out.println(l1);
		l1.removeLast();
		System.out.println(l1);
		l1.add("banana");
		System.out.println(l1);		

	}

}
