class A {
    String name="V8";
    void meth1() {
        System.out.println("I'm Parent.");
    }
}

class B extends A {
    String name="V12";
    void meth2() {
        System.out.println("I'm Child.");
    }
    void meth1(int a) {
        System.out.println("I'm Overriden.");
    }
}

public class singleInheritance {
    public static void main(String[] args) {
        B obj = new B();
        obj.meth1();
        obj.meth1(5);
        obj.meth2();
        System.out.println(obj.name);
    }
}

//Output:
//I'm Parent.
//I'm Overriden.
//I'm Child.
//V12
