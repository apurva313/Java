import java.util.*;

public class Sorted0sAnd1s {
    
    static int printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        return 0;
    }

    static void sortZerosAndOnes(int[] arr){
        int n=arr.length;
        int zeros=0;
        //here, we will count the no. of 0s
        for(int i=0; i<n; i++){
            if(arr[i]==0){
                zeros++;
            }
        }
        //0 to zeros-1: 0
        //zeros to n-1: 1
        for(int i=0; i<n; i++){
            if(i< zeros){
                arr[i]=0;
            }else{
                arr[i]=1;
            }
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
        
        System.out.print("Before Sorting: ");
        printArray(arr);

        sortZerosAndOnes(arr);
        System.out.print("After Sorting: ");
        printArray(arr);
        

    }
}
