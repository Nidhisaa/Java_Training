
import java.util.Scanner;

public class RightShift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
       
        // wanna print a M shaped star pattern


        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i == j && i<=1+size/2 ) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }


        sc.close();
    }
}