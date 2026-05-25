public class Identifiers {

    String studentName = "Nidhi";

    void displayDetails() {
        System.out.println(studentName);
    }

    public static void main(String[] args) {

        Student obj = new Student();

        obj.displayDetails();
    }
}