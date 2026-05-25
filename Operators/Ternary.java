public class Ternary {
    public static void main(String[] args) {

        int age = 20;

        String result =
                (age >= 18)
                ? "Eligible to Vote"
                : "Not Eligible to Vote";

        System.out.println(result);
    }
}