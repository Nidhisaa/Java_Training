import java.util.Scanner;

public class ProbTwo{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int GT = sc.nextInt();
            int ben = sc.nextInt();
            int BB = sc.nextInt();
            
            int benT = (GT*ben) / 100;
            System.out.println(benT);
            
            GT = GT - benT;
            int BBT = (GT*BB) / 100;
            System.out.println(BBT);
            
            GT = GT - BBT;
            System.out.println(GT);
        }

    }
}