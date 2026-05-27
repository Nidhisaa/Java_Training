import java.util.Scanner;

public class NumberSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int term = 0;
        int diff = 2;

        for (int i = 1; i <= n; i++) {
            System.out.print(term + " ");

            term = term + diff;

            if (diff == 2) {
                diff = 6;
            } else if (i % 2 == 1) {
                diff = diff + 4;
            }
        }
    }
}