package ControlFlow.CondisonalStatements;

public class NestedIf_cf {
    public static void main(String[] args) {
        int x = 5;
        int y = 10;

        if (x > 0) {
            if (y > 5) {
                System.out.println("Both conditions are true");
            }
        }
    }
}
