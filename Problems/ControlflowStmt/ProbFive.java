
package ControlflowStmt;

import java.util.*;
public class ProbFive {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(a>=b && a<=c || a>=c && a<=b){
                System.out.println(a);
            }else if(b>=a && b<=c || b<=a && b>=c){
                System.out.println(b);
            }else if(c>=a && c<=b || c<=a && c>=b){
                System.out.println(c);
            }
        }
    }
}