import java.util.Arrays;
import java.util.Scanner;

public class SwapMa7xMin{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), arr[] = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        
        Arrays.sort(arr);
        
        for (int i = 0; i < n / 2; i++) {
            System.out.print(arr[n - 1 - i] + " " + arr[i] + " ");
        }
        if (n % 2 != 0) System.out.print(arr[n / 2]);
    }
}
