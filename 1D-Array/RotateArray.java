import java.util.*;

public class RotateArray {

    static int printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        return 0;
    }

    static int[] arrayRotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        int[] ans = new int[n];
        int j = 0;

        for (int i = n - k; i < n; i++) {
            ans[j++] = arr[i];
        }

        for (int i = 0; i < n - k; i++) {
            ans[j++] = arr[i];
        }
        return ans;
    }

    static void swapInArray(int[] arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    static void reverseArray(int [] arr, int i, int j){
        while(i<j){
            swapInArray(arr, i, j);
            i++;
            j--;
        }
    }

    static void rotateInPlace(int[] arr, int k){
        int n=arr.length;
        k=k%n;
        reverseArray(arr, 0, n-k-1);
        reverseArray(arr, n-k, n-1);
        reverseArray(arr, 0, n);

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

        System.out.print("Enter the K: ");
        int k = sc.nextInt();

        System.out.print("Before Rotation: ");
        printArray(arr);

        System.out.println();

        System.out.print("After Rotation: ");
        // arrayRotate(arr, k);
        rotateInPlace(arr, k);
        printArray(arr);

    }
}
