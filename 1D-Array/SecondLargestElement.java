import java.util.*;

public class SecondLargestElement {

    static int maxi(int[] arr) {

        int n = arr.length;
        int mx = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > mx) {
                mx = arr[i];
            }
        }
        return mx;

    }

    static int secondmaxi(int[] arr){
        int mx=maxi(arr);
        int n=arr.length;
        for(int i=0; i<n; i++){
            if(arr[i] == mx){
                mx=Integer.MIN_VALUE;
            }
        }
        int secondMax=maxi(arr);

        return secondMax;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the " + n + " Elements: ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Max: "+ maxi(arr));
        System.out.println("2nd Maximum Element: " + secondmaxi(arr));

    }
}
