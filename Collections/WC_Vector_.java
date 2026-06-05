package Collections;
import java.util.ArrayList;

public class WC_Vector_ {
    


public class WC_Vector {
    public static void main(String[] args) {
        ArrayList<Integer> v = new ArrayList<>(2);
        System.out.println("Initial Size: " + v.size());
        v.add(25);
        v.add(65);
        System.out.println("After adding 2 size: " + v.size());
        v.add(45);
        v.add(89);
        v.add(23);
        v.add(77);
        System.out.println("Final Size: " + v.size());
    }

}
    
}
