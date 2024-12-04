package Practice_Question_Logic;

abstract class AbstractClass1 {
    AbstractClass1() {
        System.out.println("Constructor of abstract class");
    }
}

interface Interface1 {
   
}



public class AbstractClass {
    public static void main(String[] args) {
        child c = new child();
        c.display();
    }
}
