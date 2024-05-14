package collection_ex.queue;

import java.util.PriorityQueue;

public class PriorityQueue_ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PriorityQueue<String> pq = new PriorityQueue<>();
		pq.add("canada");
		pq.add("india");
		pq.add("usa");
		pq.add("maxico");
		pq.add("india");
		
		System.out.println(pq);
		
		Object peekvalue = pq.peek();
		System.out.println(peekvalue);//first in first out..
		
		
		
	}

}
