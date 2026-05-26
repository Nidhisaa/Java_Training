import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter score (0-100): ");
        int score;
        if (sc.hasNextInt()) {
            score = sc.nextInt();
        } else {
            System.out.println("Invalid score input");
            sc.close();
            return;
        }

        // Decide pass/fail solely by score (passing threshold: 50)
        boolean passedExam = score >= 50;

        if (passedExam) { // Outer If
            System.out.println("You passed the exam!");

            if (score >= 80) { // Inner/Nested If
                System.out.println("You earned a Distinction!"); // Path A
            } else { // Inner/Nested Else
                System.out.println("Good job."); // Path B
            }

        } else { // Outer Else
            System.out.println("You did not pass."); // Path C
        }

        sc.close();
    }
}
