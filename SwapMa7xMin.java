import java.util.Arrays;
import java.util.Scanner;

public class SwapMa7xMin{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), arr[] = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        
        Arrays.sort(arr);
        
        for (int i = 0; i < n / 2; i++) {
            System.out.print(arr[n - 1 - i] + " " + arr[i] + " ");
        }
        if (n % 2 != 0) System.out.print(arr[n / 2]);
    }
}



//Swapping of numbers based on maximum and minimum



//package Arrays;

//import java.util.*;
//public class SwappingMaxMin {
//    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        for(int i=0; i<n; i++){
//            arr[i] = sc.nextInt();
//        }

//        Arrays.sort(arr);
        // int min = 0;
        // int max = n-1;


        // for(int i=0;i<n;i++){
        //     if(i%2==0){
        //         System.out.print(arr[max]+" ");
        //         max--;
        //     }else{
        //         System.out.print(arr[min]+" ");
        //         min++;
        //     }
        // }


        // while(min<=max){
        //     if(min==max){
        //         System.out.print(arr[min]);
        //     }else{
        //         System.out.print(arr[max]+" "+arr[min]+" ");
        //     }
        //         max--;
        //         min++;
        // }


//        if(n%2==0){
//            for(int i=0; i<n/2; i++){
//                    System.out.print(arr[n-(i+1)]+" "+arr[i]+ " ");
//            }
//        }else{
//        for(int i=0; i<(n/2)+1; i++){
//              if(i==n/2){
//                    System.out.print(arr[i]);
//                }else{
//                   System.out.print(arr[n-(i+1)]+" "+arr[i]+ " ");
//                }
//          }
//       }

        // for (int i = 0; i < n / 2; i++) {
        //     System.out.print(arr[n - 1 - i] + " " + arr[i] + " ");
        // }
        // if (n % 2 != 0) System.out.print(arr[n / 2]);

//      sc.close();
//   }
//}

