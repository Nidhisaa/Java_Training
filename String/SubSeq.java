package String;
import java.util.Scanner;

public class SubSeq {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        String sub = "";
        if (sc.hasNextLine()) str = sc.nextLine();
        if (sc.hasNextLine()) sub = sc.nextLine();

        if (sub.length() == 0) {
            System.out.println("1");
            sc.close();
            return;
        }

        if (str.length() < sub.length()) {
            System.out.println("0");
            sc.close();
            return;
        }

        int i = 0, j = 0;
        while (i < str.length() && j < sub.length()) {
            if (str.charAt(i) == sub.charAt(j)) j++;
            i++;
        }

        System.out.println(j == sub.length() ? "1" : "0");
        sc.close();
    }
}
