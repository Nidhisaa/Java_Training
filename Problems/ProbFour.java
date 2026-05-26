import java.util.Scanner;
public class ProbFour{
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            if (a > 0 && a < 7) {
                boolean CanRead = ( a & 1 ) != 0; // Check if the least significant bit is 1 (odd)
                boolean CanWrite = ( a & 2 ) != 0; // Check if the second least significant bit is 1 (2 or 3)
                boolean CanExecute = ( a & 4 ) != 0; // Check if the third least significant bit is 1 (4, 5, 6)
                
                System.out.println("Can Read: " + CanRead);
                System.out.println("Can Write: " + CanWrite);
                System.out.println("Can Execute: " + CanExecute);
            } else {
                System.out.println("Invalid input");
                
            }
        }
    }
}