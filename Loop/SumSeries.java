import java.util.*;

public class SumSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the (n): ");
        System.out.println("S=1-2+3-4....n");

        int n  =sc.nextInt();

        int ans=0;
        
        for(int i=1; i<=n; i++){
            if(i%2==0){
                ans -= i;
            }else{
                ans += i;
            }
        }

       

        System.out.println("The Sum of Series till(n)  = "+ ans);
    }
}
