package Problems.StarProb;

import java.util.Scanner;

public class Mpattern_ {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){          //for rows
            for(int j=1;j<=n;j++){      //for colums and after splitting triangle it both are equal then j<=n if a column is reduced then j<=n-1
                if((j==1 || j==n)||(i==j) && i<=((n/2)+1) || (i+j==n+1) && i<=((n/2)+1)){
                System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
            sc.close();
        }
    }