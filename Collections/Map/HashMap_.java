package Collections.Map;

import java.util.HashMap;
public class HashMap_ {
    public static void main(String[] args) {
        // Map -> key -> value

        HashMap<Integer, String> details = new HashMap<>();
        details.put(1001, "Avis");
        details.put(1002, "Bob");
        details.put(1003, "Charlie");
        details.put(1000, "Shiva");
        System.out.println(details);

        System.out.println(details.get(1002));

        details.put(1003, "MKCE");
        System.out.println(details);

        System.out.println(details.getOrDefault(1007, "Hello World"));

        details.put(1007, details.getOrDefault(1007, "Hello"));
        System.out.println(details);

        System.out.println(details.putIfAbsent(1007, "Hello Terv.."));

        System.out.println(details.keySet());
        System.out.println(details.values());

        details.remove(1003);
        System.out.println(details);
    }
}