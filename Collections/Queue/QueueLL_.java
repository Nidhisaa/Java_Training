package Collections.Queue;

import java.util.LinkedList;
import java.util.Queue;
public class QueueLL_ {
    


public class QueueUsingLL {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(60);
        q.add(77);
        q.add(17);
        System.out.println(q);
        q.remove(60);   // removes only that element
        System.out.println(q);

        q.remove();       // will remove the front element (Deque Operation)
        System.out.println(q);

        q.poll();         // same as Deque operation
        System.out.println(q);

        q.remove();       // if the queue is empty then again if we call remove it raise exception and stops the program 
        System.out.println(q);

        q.poll();         
        // if the queue is empty and we call the poll then it just return the empty queue and does not reaise any exception or error in the program and contue its execution
        System.out.println(q);

        q.offer(17);    //same as enqueue it adds the element to the queue 
        q.offer(10);
        q.offer(4);
        System.out.println(q);

        System.out.println(q.peek());
    }
}
    
}
