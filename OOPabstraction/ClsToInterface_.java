package OOPabstraction;

// class to class _ extends
// class to interface _ implements
// interface to class _ not possible
// In Java, a class can implement an interface, which means that the class must provide implementations for all the methods declared in the interface.


// This code demonstrates how to convert a class to an interface in Java.
// In Java, an interface is a reference type that can contain only constants, method signatures, default methods, static methods, and nested types.
// An interface cannot be instantiated and is used to specify a behavior that classes must implement.
// To convert a class to an interface, we need to follow these steps:
// 1. Change the class keyword to interface.
// 2. Remove the class body.
// 3. Remove the constructor.
// 4. Remove the fields.
// 5. Remove the method bodies and keep only the method signatures. 
/*package OOPabstraction;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
}*/

public class ClsToInterface_ {
    interface Shape {
    void circle();
    void triangle();


    
}
    static class pen implements Shape{
    @Override
    public void circle(){
        System.out.println("Circle drawn by using a pen");
    }
    @SuppressWarnings("override")
    public void triangle(){
        System.out.println("Triangle drawn by using a pen");
    }

}

public static void main(String[] args) {
    pen p = new pen();
    p.circle();
    p.triangle();
    
}



}