import java.util.*;

public class NumPrint {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Number rows: ");
        int r= sc.nextInt();

        for(int i=1; i<=r; i++){
            for(int j=i; j<=r; j++){
                System.out.print(j);
            }
            for(int k=1; k<= i-1; k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
