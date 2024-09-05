//The reverse=> with the help of another array

import java.util.*;

public class ReverseArray {
    
    static int[] arrayReverse(int[] arr){
        int j=0;
        int[] ans= new int[arr.length];
       for(int i=arr.length-1; i>=0; i--){
            ans[j++] =arr[i];
       }
        return ans;
    }

    static void display(int [] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();

        int[] arr= new int[n];

        System.out.println("Enter the "+ n + " Elements: ");
        
        for(int i=0; i<arr.length; i++){
             arr[i]=sc.nextInt();
        }
        
        System.out.print("The reverse array is: ");
        int[] ans=arrayReverse(arr);
        
        display(ans);
    }
}
