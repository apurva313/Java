
public class ThrowAndThrows {
    public static void main(String[] args){
        try{
            int a = 10;
            int b = 0;
            if(b == 0){
                throw new ArithmeticException("Cannot divide by zero");
            }
            int c = a / b;  
            System.out.println(c);
        }catch(ArithmeticException e){
            System.out.println("Some error -> "+ e);
    }

    System.out.println("Rest of the code");
    }
}
