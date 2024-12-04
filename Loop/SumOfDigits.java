import java.util.*;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Digits: ");
        int n  =sc.nextInt();

        int sumOfDigits=0;
        int original_n=n;

        while(n>0){
            
            sumOfDigits += n%10;
            n=n/10;
            
        }

        System.out.println("The number Digits in "+ original_n +" = "+ sumOfDigits);
    }
}
