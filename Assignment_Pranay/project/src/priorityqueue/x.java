package priorityqueue;

import java.util.Iterator;
import java.util.PriorityQueue;

//Does not allow null elemtns
//Does not allow insertion of non comparable objects: Leads to class cast exception
public class x {
	
	public static void main(String[] args) {
		PriorityQueue<Integer> pq= new PriorityQueue<>();
		
		
		System.out.println("Size: "+ pq.size());
		pq.add(500);
		pq.add(300);
		pq.add(100);
		pq.add(400);
		
		System.out.println("\nSize: "+ pq.size());
		
		//No difference b/w offer and add
		pq.offer(600);
		
		Iterator it= pq.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		//Another way of printing: [ ] : toString method
		//System.out.println(pq);
		
		System.out.println("Head value: "+ pq.peek());
		
		//poll(): Rerives and removes
		System.out.println(pq.poll());
		System.out.println(pq);
		
		//removes highest priority element
		pq.remove();
		System.out.println(pq);
		
		boolean contains = pq.contains(600);
		System.out.println("pq contains 600: "+ contains +"\n");
		
		Object[] numbers= pq.toArray();
		
		for(Object o: numbers) {
			System.out.println(o);
		}
	}

}
