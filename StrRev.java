public class StrRev {
    public static void main (String[] args) {
        String str = "Hello, World!";
        String reversedStr = reverseString(str);
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversedStr);
    }

    public static String reverseString(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
