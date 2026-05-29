package Problems;
import java.util.*;


public class MatrixMultiple_pr {
    public static void main(String args[]){
        try (Scanner sc = new Scanner(System.in)) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            int arr[][] = new int[m][m];
            int arr1[][] = new int[n][n];
            if(m==n){
                for(int i=0; i<n;i++){
                    for(int j=0;j<n;j++){
                        arr[i][j] = sc.nextInt();
                    }
                }
                for(int i=0; i<m;i++){
                    for(int j=0;j<m;j++){
                        arr1[i][j] = sc.nextInt();
                    }
                }
            }
            int c[][] = new int[m][n];
            for(int i=0;i<m;i++){
                for(int j=0;j<m;j++){
                    c[i][j]=0;
                    for(int k =0 ;k<n;k++){
                        c[i][j] += arr[i][k]*arr1[k][j];
                    }
                    System.out.print(c[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}
    

