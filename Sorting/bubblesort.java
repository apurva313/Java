public class bubblesort {

    public static void bubble(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {

                if (arr[j] < arr[j + 1]) {
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }

    }

    public static void print(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            System.out.print(arr[i] + " ");

        }
    }

    public static void main(String[] args) {
        int arr[] = { 0, 2, 1, 2, 0 };
        int n = arr.length;

        System.out.print("Before Sorting: ");
        print(arr, n);

        bubble(arr, n);

        System.out.print("\nAfter Sorting: ");
        print(arr, n);
    }
}
