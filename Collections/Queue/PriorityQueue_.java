package Collections.Queue;

import java.util.PriorityQueue;
public class PriorityQueue_ {
   

public class PriorityQue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(5);
        pq.add(15);
        pq.add(3);
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.poll());

        System.out.println(pq);

        int num = pq.element();
        System.out.println(num);

        System.out.println(pq.toString());
    }
}
    
}
