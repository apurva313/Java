// Java problem to implement 100% abstraction

abstract class A {
    abstract void m1();

    abstract void m2();

}

abstract class child extends A {
    void m1() {
        System.out.println("I am inside m1!");
    }
}

public class test3 extends child {
    void m2() {
        System.out.println("I am implememted!");

    }

    public static void main(String a[]) {
        A ref = new test3();
        ref.m1();
        ref.m2();

    }

}