import java.util.*;

public class CheckSortedArray {
    
    static int printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        return 0;
    }

    static boolean isSorted(int[] arr){
        boolean check=true;
        
        for(int i=1; i<arr.length; i++){
            if(arr[i]< arr[i-1]){
                check=false;//not sorted
                break;
            }
        }
        return check;
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
       
       
        // System.out.print("The element of Array are: "+ printArray(arr));
        System.out.print("Is Sorted:  " +isSorted(arr));
       

    }
}
