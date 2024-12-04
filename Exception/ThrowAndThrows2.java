
public class ThrowAndThrows2 {

    public static void checkage() throws ArithmeticException{
        int age = 15;
        // if(age < 18){
        //     throw new ArithmeticException("Not valid age");
        // }else{
        //     System.out.println("Valid age");
        // }

        System.out.println(12/0);
    }
    public static void main(String[] args){
        try{
            checkage();
        }catch(Exception e){
            System.out.println("Some error -> "+ e);
        }
    }
}

