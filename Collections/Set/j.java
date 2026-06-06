package Collections.Set;

import java.util.HashSet;
import java.util.Iterator;

public class j {
    public static void main(String[] args) {

        HashSet<Integer> hs = new HashSet<>();
        hs.add(10);
        hs.add(20);
        hs.add(1);
        hs.add(5);

        System.out.println(hs);

        hs.remove(20);
        System.out.println(hs);

        // hs.clear(); //dlt
        // System.out.println(hs);

        System.out.println(hs.contains(1)); //dlt ana apro yethum irukathu so false
        Iterator<Integer> iter = hs.iterator();
        //next(), hasNext()

        while (iter.hasNext()) {
            System.out.println(iter.next() + " ");
        }

        HashSet<Integer> s = new HashSet<>();
        s.add(1);
        s.add(2);
        s.add(5);
        s.add(10);
        System.out.println("before" + hs);
        //hs.retainAll(s);
        hs.removeAll(s);
        System.out.println("after" + hs);

    }

}
    

