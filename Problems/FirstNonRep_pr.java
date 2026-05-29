package Problems;
import java.util.Scanner;

public class FirstNonRep_pr {
	public static void main(String[] args) {
            try (Scanner sc = new Scanner(System.in)) {
// input is "teeterson" output is 'r'
                String str = sc.next();
                for (int i = 0; i < str.length(); i++) {
                    char c = str.charAt(i);
                    if (str.indexOf(c) == str.lastIndexOf(c)) {
                        System.out.println(c);
                        break;
                    }
                }

            }
        }
    }

// input is "teeterson" output is 'r'
// ANOTHER LOGIC TO SOLVE
//int [] count = new int[26];
// for (int i = 0; i < str.length(); i++) {
// count[str.charAt(i) - 'a']++;
//}
// for (int i=0; i<str.lemngth(;i++){) {
//     System.out.println("Character : "+(char)(i+97)+" Count : "+

//     count[i]) );
//     }


// METH 2
// for (int i = 0; i < str.length(); i++) {
//     char c = str.charAt(i);  
//     if (str.indexOf(c) == str.lastIndexOf(c)) {
//         System.out.println(c);
//         break;
//     }
// }


//METH 3
// for (int i = 0; i < str.length(); i++) {
//     if(count[str.charAt(i) - 'a'] == 1) {
//         System.out.println(str.charAt(i));
//         break;
//     }
// }