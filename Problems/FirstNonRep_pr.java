package Problems;
import java.util.Scanner;

public class FirstNonRep_pr {
	public static void main(String[] args) {
            try (Scanner sc = new Scanner(System.in)) {
// input is "teeterson" output is 'r' , simple code to find the first non repeating character in a string
                String str = sc.next();
                for (int i = 0; i < str.length(); i++) {
                    char c = str.charAt(i);
                    if (str.indexOf(c) == str.lastIndexOf(c)) {
                        System.out.println(c);
                        break;
                    }
                }

            }
        }
    }