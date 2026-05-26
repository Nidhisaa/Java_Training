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

        String s = Integer.toString(Math.abs(num));
        boolean palindrome = s.equals(new StringBuilder(s).reverse().toString());

        if (palindrome) {
            System.out.println("Safe Unlocked!");
        } else {
            System.out.println("Access Denied");
        }

        sc.close();
    }

    }


