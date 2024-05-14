package collection_ex.addmap;

import java.util.TreeMap;

public class TreeMap_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Integer,String> tm = new TreeMap<>();
		tm.put(1, "red");
		tm.put(3, "green");
		tm.put(4, "blue");
		tm.put(2, "purple");
		tm.put(1, "yellow");
		System.out.println(tm);//shoreted based on key
		

		

	}

}
