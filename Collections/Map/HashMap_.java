package Collections.Map;

import java.util.HashMap;
import java.util.Map;
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

        System.out.println(details.containsKey(1000));
        System.out.println(details.containsValue("Bob"));

        // for accessing elements based on your choice the EntrySet will be used
        for(Map.Entry<Integer, String> pair:details.entrySet()){
            System.out.println(pair.getKey()+" : "+pair.getValue());
        }
    }
}