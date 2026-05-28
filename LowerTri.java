import java.util.*;
public class LowerTri {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int arr[][] = new int[n][n];
            
            
            
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    arr[i][j] = sc.nextInt();
                }
                
            }
            int max = 0;
            for(int i=0;i<n;i++){
                int sum = 0;
                for(int j=0;j<n;j++){
                    sum = sum + arr[i][j];
                }
               
                if(sum > max){
                    max = sum;
                }
            }
            
            System.out.print(max);
        }
    }
}