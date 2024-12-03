class A {
    void meth1() {
        System.out.println("I'm Parent.");
    }
}

class B extends A {
    void meth2() {
        System.out.println("I'm Child.");
    }
    void meth1() {
        System.out.println("I'm Overriden.");
    }
}

public class singleInheritance {
    public static void main(String[] args) {
        B obj = new B();
        obj.meth1(); 
        obj.meth2();
    }
}

//Output:
//I'm Overriden.
//I'm Child.