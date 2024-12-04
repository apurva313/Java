import java.util.Scanner;

public class A4_PascalTriangle {

    static void printArray(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int[][] pascal(int n){
        int [][] ans=new int [n][];

        for(int i=0; i<n; i++){
            //ith rows has i+1 column
            ans[i]=new int [i+1]; //no. of cols in ith row= i+1

            //1st and last elememt of every row is  1
            ans[i][0]=ans[i][i]=1;

            //for previous two add of this 
            for(int j=1; j<i; j++){
                ans[i][j]=ans[i-1][j]+ans[i-1][j-1];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows:");
        int n = sc.nextInt();
       int [][] ans= pascal(n);
        printArray(ans);

    }
}
