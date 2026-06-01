package ExceptionHandling;

import java.util.*;
public class trycatchfinally {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();  //12.5
            System.out.println(num);
        }
        // common exception that handles all the exception
        catch(Exception e){
            System.out.println("Exception handled");
            System.out.println(e);
        }
        // Multiple catch block can be used

        // catch(ArithmeticException e){
        //     System.out.println("Arithmetic Exception Handled");
        //     System.out.println(e);
        // }

        // catch(IndexOutOfBoundsException e){
        //     System.out.println("Index out of bound Exception handled");
        //     System.out.println(e);
        // }

        // catch(InputMismatchException e){
        //     System.out.println("Input mismatch Exception handled");
        //     System.out.println(e);
        // }

        finally{
            System.out.println("Hiiii...Exception");
        }
        System.out.println("End of the program");
    }
}
