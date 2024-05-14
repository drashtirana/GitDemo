package collection_ex.listexample;

import java.util.Iterator;
import java.util.Vector;

public class Vector_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vector <Integer> v = new Vector<>();
		v.add(1);
		v.add(0);
		System.out.println(v);
		Iterator <Integer> ir = v.iterator();
		while(ir.hasNext()) {
			System.out.println(ir.next()+2);
			
		}
	}

}
