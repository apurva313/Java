import java.util.*;

public class countOccurence {
    
    static int printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        return 0;
    }

    static int countOccur(int[] arr, int x){
        int count=0;
        for(int i=0; i<arr.length; i++){
           if(arr[i]==x){
            count++;
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
        System.out.print("Enter x:");
        int x=sc.nextInt();
       
        // System.out.print("The element of Array are: "+ printArray(arr));
        System.out.print("Count Occurence of "+ x + " :" +countOccur(arr, x));
       

    }
}
