import java.util.Scanner;

public class ProbThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 4-digit number (1000-9999): ");
        int num;
        if (sc.hasNextInt()) {
            num = sc.nextInt();
        } else {
            System.out.println("Invalid number input");
            sc.close();
            return;
        }

        if (num < 1000 || num > 9999) {
            System.out.println("Invalid input");
            sc.close();
            return;
        }

        // Numeric-only palindrome check for 4-digit number abcd: check a==d and b==c
        int n = Math.abs(num);
        int a = n / 1000;
        int b = (n / 100) % 10;
        int c = (n / 10) % 10;
        int d = n % 10;
        boolean palindrome = (a == d) && (b == c);

        if (palindrome) {
            System.out.println("Safe Unlocked!");
        } else {
            System.out.println("Access Denied");
        }

        sc.close();
    }
}


