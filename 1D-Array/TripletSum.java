import java.util.*;

public class TripletSum {
    
    static int sumTriplet(int[] arr, int target){

        int n=arr.length;
        int count=0;

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+1; k<n; k++){

                    if(arr[i]+arr[j]+arr[k]==target){
                        count++;
                    }
                }
            }
        }
        return count;

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
        
       
        System.out.print("Enter the Target Sum: ");
        int target= sc.nextInt();

        System.out.println(sumTriplet(arr, target));

    }
}
