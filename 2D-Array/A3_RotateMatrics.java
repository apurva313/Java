import java.util.Scanner;

public class A3_RotateMatrics  {

    static void printArray(int[][]a){
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        } 
    }

    static void transposeArrayInPlace(int[][]arr, int r, int c){
        for(int i=0; i<c; i++){
            for(int j=i; j<r; j++){
               int temp=arr[i][j];
               arr[i][j]=arr[j][i];
               arr[j][i]=temp; 
            }
        }
    }

    static void reverse(int[] arr){
        int i=0;
        int j=arr.length-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }

    static void rotate(int[][]arr, int n){
        transposeArrayInPlace(arr, n, n); //transpose the matrics
        for(int i=0; i<n; i++){ //here we just reverse the transpose matrics
            reverse(arr[i]);
        }
    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the no. of rows and column:");
        int r= sc.nextInt();
        int c= sc.nextInt();
        int [][] a= new int[r][c];
        System.out.println("Enter the values: ");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                a[i][j]=sc.nextInt();
            }
        }

    
        System.out.println("The Input Matrics are: ");
        printArray(a);
        
        rotate(a, r);
        System.out.println("The Rotate Matrics are: ");
        printArray(a);

       
        
   }
    }
