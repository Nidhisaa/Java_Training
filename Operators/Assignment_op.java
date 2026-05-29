package Operators;
public class Assignment_op {
    public static void main(String[] args) {

        int a = 10;

        System.out.println("Initial Value = " + a);

        a += 5;
        System.out.println("a += 5 : " + a);

        a -= 3;
        System.out.println("a -= 3 : " + a);

        a *= 2;
        System.out.println("a *= 2 : " + a);

        a /= 4;
        System.out.println("a /= 4 : " + a);

        a %= 3;
        System.out.println("a %= 3 : " + a);
    }
}