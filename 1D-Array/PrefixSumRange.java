//Given an array of interger of size n. Answer q quries where youb need to print the sum of values in a given range indices from 1 to r (both includes)
// Note: the values of 1 to r in queries follow 1-based indexing
import java.util.*;

public class PrefixSumRange {

    static int printArray(int[] arr) {
        for (int i = 1; i <= arr.length-1; i++) {
            System.out.print(arr[i] + " ");
        }
        return 0;
    }

    static int[] makePrefixSumArray(int[] arr) {
       
         for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n+1];

        System.out.print("Enter the " + n + " Elements: ");

        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Original Array: ");
        printArray(arr);

        System.out.println();

        int[] prefSum = makePrefixSumArray(arr);

        System.out.print("Enter the number of quries: ");
        int q=sc.nextInt();

        while(q-- > 0 ){
            System.out.print("Enter the range: ");
            int l=sc.nextInt();
            int r=sc.nextInt();

            int ans= prefSum[r]- prefSum[l-1];
            System.out.println("Sum: "+ ans);
        }

    }
}

