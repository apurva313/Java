import java.util.*;
public class factorial {
    static int fact(int num){
        if (num==0) {
            return 1;
        }
        if (num==1) {
            return 1;
            
        }
        else{
            return num*fact(num-1);
        }
    }
    public static void main(String[] args) {
        int num=5;
       
       int f=fact(num);
       System.out.println("Factorial of the "+num+ " is "+f);

        
    }
}
