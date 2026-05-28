import java.util.Scanner;

public class DiffBtwn {
	public static void main(String[] args) {
            try (Scanner sc = new Scanner(System.in)) {
                int n = sc.hasNextInt() ? sc.nextInt() : 0;
                long diff = 0;
                for (int i = 0; i < n && sc.hasNextLong(); i++) {
                    long x = sc.nextLong();
                    diff += (x % 2 == 0) ? x : -x;
                }
                System.out.println(Math.abs(diff));
            }
	}
}
