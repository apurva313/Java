import java.util.Scanner;

public class A2_Transpose {

    static void printArray(int[][]a){
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        } 
    }
    static int[][] transposeArray(int[][]arr, int r, int c){
        int[][] ans=new int[c][r];

        for(int i=0; i<c; i++){
            for(int j=0; j<r; j++){
                ans[i][j]=arr[j][i];
            }
        }
        return ans;
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
        // int ans[][]=transposeArray(a, r, c);
        transposeArrayInPlace(a, r, c);
        System.out.println("The Tanspose Matrics are: ");
        printArray(a);

       
        
   }
    }
