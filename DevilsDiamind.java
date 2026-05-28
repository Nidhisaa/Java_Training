import java.util.Scanner;

public class DevilsDiamind {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();

        int left = 1;
        int right = n * n + 1; 
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j >= i) {
                    System.out.print(left++ + "*");
                } else {
                    System.out.print("__");
                }
            }
            
            for (int k = 1; k < n; k++) {
                if (i + k < n + 1) {
                    System.out.print(right++ + "*");
                }
            }
            
             System.out.print(right); 
            
             right = right - (2 * (n - i)); 
            System.out.println();
        }
        sc.close();
    }
}

//#region PATTERN STRATEGY DOCUMENTATION
/* 
 =========================================================================
 STRATEGY BLUEPRINT: The Devil's Diamond Pattern (n * n + 1 Method)
 =========================================================================
 
 STEP 1: DEFINE STRUCTURAL BOUNDARIES
 ------------------------------------
 * The pattern has 'n' total rows, structured as a decreasing pyramid.
 * 'left' starts at 1 and increments continuously across the entire program.
 * MATH TRICK: The right-side top-left start value is always exactly (n * n + 1).
   (e.g., if n=4, the right side starts precisely at 4*4 + 1 = 17).
 
 STEP 2: OUTER ROW LOOP (i-loop from 1 to n)
 --------------------------------------------
 * Manages the current row level.
 * Dictates how many elements print on the left and right: (n - i + 1).
 
 STEP 3: LEFT-HAND GRID (j-loop from 1 to n)
 -------------------------------------------
 * Handles formatting before the midpoint split.
 * CRITICAL CONDITION: if (j >= i)
   - TRUE:  Print the current 'left++' value followed by an asterisk "*".
   - FALSE: Print leading padding/underscores "__" to indent the row.
 
 STEP 4: RIGHT-HAND GRID (k-loop from 1 to n-1)
 ---------------------------------------------
 * Handles the running numbers on the right side of the split.
 * CRITICAL CONDITION: if (i + k < n + 1)
   - TRUE:  Print the current 'right++' value followed by an asterisk "*".
   - NOTE: We run this loop up to (n-1) to leave the last element hanging.
 
 STEP 5: PREVENT TRAILING ASTERISK
 ---------------------------------
 * Explicitly call System.out.print(right) outside the k-loop.
 * This appends the final number of the row neatly *without* a trailing "*".
 
 STEP 6: MATH RESET FOR NEXT ROW
 -------------------------------
 * The value of 'right' has grown too large because of the ++ operations.
 * FORMULA: right = right - (2 * (n - i))
 * WHY IT WORKS: It rewinds 'right' backwards to the starting threshold 
   needed for the next row down.
 * Finish the row lifecycle by printing a newline: System.out.println().
 =========================================================================
  */
//#endregion

