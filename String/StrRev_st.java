package String;
import java.util.*;
public class StrRev_st {
   /* public static void main (String[] args) {
        String str = "Hello, World!";
        String reversedStr = reverseString(str);
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversedStr);
    }

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }*/

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            String rev = "";
            /*for(int i = s.length() - 1; i >= 0; i--){
                rev = rev + s.charAt(i);
            }
            System.out.println(rev);*/

            
            // "hellow world " to "world hellow"
            String[] arr = s.split(" ");
            for(int i = arr.length - 1; i >= 0; i--){
                rev = rev + arr[i] + " ";
            }
            System.out.println(rev);
        }
}
