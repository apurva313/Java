import java.util.*;
public class A1_TakingInputDisplay {

    static void printArray(int[][]a){
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        } 
    }

    static void add(int[][]a,int r1, int c1, int[][]b,int r2, int c2){
        if(r1!=r2 || c1!= c2){
            System.out.println("Not Possible Addition!");
            return;
        }
        int[][] sum=new int[r1][r2];
        for(int i=0; i<r1; i++){
            for(int j=0; j<r2; i++){
                sum[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println(sum);
    }
   public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter the no. of rows and column of 1:");
    int r1= sc.nextInt();
    int c1= sc.nextInt();
    int [][] a= new int[r1][c1];
    System.out.println("Enter the values: ");
    for(int i=0; i<r1; i++){
        for(int j=0; j<c1; j++){
            a[i][j]=sc.nextInt();
        }
    }

    System.out.print("Enter the no. of rows and column of 2:");
    int r2= sc.nextInt();
    int c2= sc.nextInt();
    int [][] b= new int[r2][c2];
    System.out.println("Enter the values: ");
    for(int i=0; i<r2; i++){
        for(int j=0; j<c2; j++){
            b[i][j]=sc.nextInt();
        }
    }

    System.out.println("The Array 1: ");
    printArray(a);
    System.out.println("The Array 1: ");
    printArray(b);
    add(a, r1, c1, b, r2, c2);
   }
    
}
