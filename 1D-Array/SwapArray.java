import java.util.*;

public class SwapArray {
    
    static int printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        return 0;
    }

    static void swapInArray(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static void reverseArray(int [] arr){
        int i=0;
        int j=arr.length-1;

        while(i<j){
            swapInArray(arr, i, j);
            i++;
            j--;
        }
    }
    

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();

        int[] arr= new int[n];

        System.out.print("Enter the "+ n + " Elements: ");
        
        for(int i=0; i<arr.length; i++){
             arr[i]=sc.nextInt();
        }
        
       reverseArray(arr);
       System.out.print("Reverse Array: ");
       printArray(arr);
        

    }
}
