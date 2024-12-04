import java.util.*;

public class Sorted0sAnd1sUsingTwoPointer {
    
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

    static void sortZerosAndOnes(int[] arr){
        int n=arr.length;
        int left=0;
        int right=n-1;

        while(left < right){
            if(arr[left]==1 && arr[right]==0){
                swapInArray(arr, left, right);
                left++;
                right--;
            }
            if(arr[left]==0){
                left++;
            }
            if(arr[right]==1){
                right--;
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

        System.out.println();
        
        sortZerosAndOnes(arr);
        System.out.print("After Sorting: ");
        printArray(arr);
        

    }
}
