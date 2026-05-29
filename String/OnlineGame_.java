package String;

import java.util.*;
public class OnlineGame_ {
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        // String game = "";

        // for(int i=0;i<n;i++){
        //     if(arr[i]%2==0){
        //         game = game + arr[i]+" ";
        //     }
        // }
        // for(int i=0;i<n;i++){
        //     if(arr[i]%2==1){
        //         game = game + arr[i]+" ";
        //     }
        // }
        int left = 0;
        int right = n-1;
        while(left < right){
            while(arr[left]%2==0){
                left++;
            }
            while(arr[right]%2==1){
                right--;
            }
            if(left < right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }

        System.out.println("Array After Segregation");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }    
}