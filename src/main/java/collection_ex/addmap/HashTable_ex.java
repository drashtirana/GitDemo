package collection_ex.addmap;

import java.util.Hashtable;

public class HashTable_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hashtable<Integer,String> ht = new Hashtable<>();
		ht.put(1,"parrot");
		ht.put(2, "sparorw");
		ht.put(3, "duck");
		ht.put(4, "crow");
		ht.put(5, "duck");//duplicate value is allow but duplicate ket not allowed..
		
		System.out.println(ht);//null key null value not allow
		
		

	}

}
