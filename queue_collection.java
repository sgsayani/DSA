
import java.util.LinkedList;
import java.util.Queue;
/* 
public class queue_collection {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();

		// add elements to the queue
		queue.add("apple");
		queue.add("banana");
		queue.add("cherry");

		// print the queue
		System.out.println("Queue: " + queue);

		// remove the element at the front of the queue
		String front = queue.remove();
		System.out.println("Removed element: " + front);

		// print the updated queue
		System.out.println("Queue after removal: " + queue);

		// add another element to the queue
		queue.add("date");

		// peek at the element at the front of the queue
		String peeked = queue.peek();
		System.out.println("Peeked element: " + peeked);

		// print the updated queue
		System.out.println("Queue after peek: " + queue);
	}
}
*/

import java.util.*;


public class queue_collection {
   public static void main(String args[]) {
       //Queue<Integer> q = new LinkedList();
       //Deque<Integer> q = new ArrayDeque();
       Queue <Integer> q = new LinkedList<>();
       q.add(1);
       q.add(2);
       q.add(3);
       q.add(4);
       q.add(5);


       while(!q.isEmpty()) {
           System.out.println(q.peek());
           q.remove();
       }
   }
}

