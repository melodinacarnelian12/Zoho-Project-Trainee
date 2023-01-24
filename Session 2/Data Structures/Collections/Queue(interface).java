import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
public class Main {
	public static void main(String[] args) {
		LinkedList q=new LinkedList();
		q.add("A");
		q.add("B");
		q.add("C");
		q.offer(100); 
		q.offer("C"); 
		System.out.println(q); 
	  System.out.println(q.element());  
		System.out.println(q.peek()); 
		System.out.println(q.remove()); 
		System.out.println(q);
		System.out.println(q.poll()); 
		System.out.println(q); 
	}

}
