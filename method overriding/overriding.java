
// method overriding --- chld class nethod override the parent class method 
// for method overriding -- therer should be a inheritance relationship 
// same method name with same parameter 

class parent{
     void method(int x,int y){
        int sub=x-y;
        System.out.println("The sub of " +x+ "-" +y+"is "+ sub);
        
     }
}
class child extends parent{
     void method(int x,int y){
        int sum=x+y;
        System.out.println("The sum of " +x+ "+" +y+"is "+ sum);
        
     }
}
public class overriding extends child{
    public static void main(String[] args) {
        overriding ob=new overriding();
        ob.method(5,  6);
    }
}