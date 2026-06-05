package Collections;

import java.util.*;
// import java.util.List;
// import java.util.ArrayList;

public class WrapperClsImplementation_ {

public class wrapperclassImplementation {
    public static void main(String[] args) {
        // class/Interface_name <wrappercls(datatype)> obj_name = new constructor<>();
    
// after = the datatype can be mentioned or not but it only take the integer if we alreaddy mentioned in the declaration part
        
        ArrayList<String> words = new ArrayList<>();
        words.add("Apple");    // to add an element to a list
        words.add("Bat");
        words.add("Car");
        words.add("Donkey");
        words.add("Apple");

        System.out.println(words);
        System.out.println("Get Method: "+words.get(2));  // to get the element from the lsit 

        words.set(2,"Curd");  // to set the element to the array lsit
        System.out.println(words);
        System.out.println("Get Method: "+words.get(2));

        int size = words.size();  // to find the size of an array
        System.out.println("Size: "+size);

        words.remove(2);  // to remove the word from the given index 
        System.out.println(words);

        System.out.println(words.contains("Terv"));   // to find if the given word is present in the list or not 

        System.out.println(words.isEmpty());  // to find if the list is empty or not
        
        // words.clear();  // to clear the collection 
        // System.out.println(words.isEmpty());

        System.out.println(words);

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Pappaya");
        fruits.add("Grapes");

        System.out.println(fruits);

        words.removeAll(fruits);  // removes values from 1st collection which are present in the 2nd collection
        System.out.println(words);

        

    }   
}
}
