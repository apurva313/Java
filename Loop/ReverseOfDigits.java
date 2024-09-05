import java.util.*;

public class ReverseOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n  =sc.nextInt();

        int answer=0;
        int original_n=n;

        while(n>0){
           answer = answer*10 + n%10;
           n/= 10;
        }

        System.out.println("The number Number of "+ original_n +" is = "+ answer);
    }
}
