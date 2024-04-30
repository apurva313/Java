import java.util.*;

// given an integer array "arr" ,return the prefix sum / running sum in the same array without creating a  new array 

// prefix sum = contineous sum from staring index to current index
// index 3 prefix sum = sum of index 0 + index 1 + index 2+ index 3 ;

class prefixSum {

    static void display(int[] arr) {
        System.out.print("\nThe Array are :");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+ arr[i]+ " ");

        }
    }

    static void prefix(int[] arr) {
        
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            // storing the element value in sum variable
            sum += arr[i];
            // changing the value of array with the prefix sum value
            arr[i] = sum;

        }

    }

    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print(" Element" + i + ": ");
            arr[i] = sc.nextInt();

        }

        display(arr);
        prefix(arr);

        System.out.println("\n\nAfter Prefix Sum:");
        display(arr);

    }

}