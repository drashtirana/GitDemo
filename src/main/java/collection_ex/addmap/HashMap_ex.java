package collection_ex.addmap;

import java.util.HashMap;

public class HashMap_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> hm = new HashMap<>();
		hm.put(1,"cat");
		hm.put(2,"dog");
		hm.put(3,"cow");
		hm.put(null,"rat");
		hm.put(2,"lion");
		hm.put(2,"dog");// not allow duplicate key
		hm.put(4,"cat");//allow duplicate value
		hm.put(6, null);
		hm.put(7, null);
		hm.put(7, "bear");
		
		System.out.println(hm);//unordered and not shorted..
		System.out.println(hm.values());
		System.out.println(hm.keySet());
	}

}
