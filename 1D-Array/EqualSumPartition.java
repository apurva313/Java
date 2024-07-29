import java.util.*;

public class EqualSumPartition{

   static int findArraySum(int[] arr){
        int totalSum=0;
        for(int i=0; i<arr.length; i++){
            totalSum+=arr[i];
        }
        return totalSum;
   }

   static boolean equalSum(int[] arr){
        int totalSum=findArraySum(arr);
        int prefixSum=0;
        for(int i=0; i<arr.length; i++){
            prefixSum+=arr[i];
            int suffixSum=totalSum-prefixSum;
            if(prefixSum == suffixSum){
                return true;
            }
        }
        return false;
   }

   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the " + n + " Elements: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

       System.out.println("Equal Partition Possible: "+equalSum(arr));

    }
}
