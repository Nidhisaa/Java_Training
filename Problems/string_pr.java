package Problems;


public class string_pr{
    @SuppressWarnings("StringEquality")
    public static void main (String[] args) {
        String s_1 = "Hello";
        @SuppressWarnings("RedundantStringConstructorCall")
        String s_2 = new String("Hello");
        // stringName.length()
        @SuppressWarnings("unused")
        int length = s_1.length();
        //access 
        // stringName.charAt(index);
        char c = s_1.charAt(3);
        System.out.print(c);
    // stringName.toCharArray();
        char[] convert = s_1.toCharArray();
        System.out.print(convert);
    // StringName.toUpperCase()
    // StringName.toLowerCase();
    // StringName.indexOf(character) - if present returns  first occurence index,else return -1
    // StringName.lastIndexOf(character);
    System.out.print(s_1 == s_2);
    // StringName1.equals(StringName2)
    System.out.println(s_1.equals(s_2));
    //  StringName1.compareTo(StringName2)
    System.out.print("Hello Java".contains("java"));
    //String1.startaWith(string2)
    // String1.endsWith(String2)
    // stringName.substring(start, end)/(start)
    System.out.println("Hello_World".substring(5));
    // string1.concat(string2)
    //stringName.split(regex)
    
    String str = "Hello java program for MKCE";
    
    String []split = str.split("a");
    for(String x  :split)
        System.out.print(x +" ");
    
    // stringName.replace(old, new)
    String m = "Hello Hello";
    String r = m.replace('e','o');
    System.out.print(r);
}

    
}
