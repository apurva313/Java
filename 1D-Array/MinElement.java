import java.util.*;

public class MinElement {
    
    static int mini(int[] arr){

        int n=arr.length;
        int mx=Integer.MAX_VALUE;
       

        for(int i=0; i<n; i++){
           if(arr[i]<mx){
            mx=arr[i];
           }
        }
        return mx;

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
        
       System.out.println("Minimum Element: "+ mini(arr));

    }
}
