package ControlFlow.CondisonalStatements;

import java.util.Scanner;

public class ElseIf_cf {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int score;
            
            System.out.print("Enter score (0-100): ");
            if (sc.hasNextInt()) {
                score = sc.nextInt();
            } else {
                System.out.println("Invalid input");
                sc.close();
                return;
            }
            
            if (score >= 90) {
                System.out.println("Grade: A"); // Checked 1st
            } else if (score >= 80) {
                System.out.println("Grade: B"); // Checked 2nd (only if 1st was false)
            } else if (score >= 70) {
                System.out.println("Grade: C"); // Checked 3rd (only if 1st and 2nd were false)
            } else {
                System.out.println("Grade: F"); // Runs only if ALL above are false
            }
        }
    }
}
