import java.util.*;

public class SearchMultiple {

    static int[] makeFrequencyArray(int[] arr) {
        int[] freq = new int[100005];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        return freq;

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

        int freq[] = makeFrequencyArray(arr);

        System.out.print("Enter the Number of Queries: ");
        int q = sc.nextInt();

        while (q > 0) {
            System.out.print("Enter number to be Search: ");
            int x = sc.nextInt();

            if (freq[x] > 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            q--;
        }

    }
}
