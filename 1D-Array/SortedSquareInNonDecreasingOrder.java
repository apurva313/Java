import java.util.*;

public class SortedSquareInNonDecreasingOrder {
    
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

    static void reverse(int[] arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            swapInArray(arr, i, j);
            i++;
            j--;
        }
    }

    static int[] sortSquare(int[] arr){
        int n=arr.length;
        int left=0;
        int right=n-1;

        int[] ans=new int[n];
        int k=0;

        while(left <= right){
            if(Math.abs(arr[left]) > Math.abs(arr[right]) ){
                ans[k++]= arr[left] * arr[left];
                left++;
            }else{
                ans[k++]= arr[right] * arr[right];
                right--;
            }
        }
        return ans;
    }
    

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n=sc.nextInt();

        int[] arr= new int[n];

        System.out.print("Enter the "+ n + " Elements(non-decreasing order): ");
        
        for(int i=0; i<arr.length; i++){
             arr[i]=sc.nextInt();
        }
        
        System.out.print("Original Array: ");
        printArray(arr);

        System.out.println();
        
        int[] ans=sortSquare(arr);
        reverse(ans);
        System.out.print("After Square in order of non-decrersing: ");
        printArray(ans);
        

    }
}
