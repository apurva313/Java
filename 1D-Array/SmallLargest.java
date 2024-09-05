import java.util.*;

public class SmallLargest {
    
    static int printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        return 0;
    }

    static int[] slValue(int [] arr){
        Arrays.sort(arr);

        int [] ans={arr[0], arr[arr.length-1]};


        return ans;
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
        //System.out.print("Last Occurence of x:"+ lastOccur(arr, x));
       int[] ans= slValue(arr);
       System.out.println("Smallest: "+ ans[0]);
       System.out.println("Largest: "+ ans[1]);

    }
}
