class A {
    A get() {
        System.out.println("Inside class A");
        return this;
    }
}

class B extends A {
    @Override
    B get() {
        System.out.println("Inside class B");
        return this;
    }
}

public class CovariantExample {
    public static void main(String[] args) {
        // A a = new A();
        // a.get();

        B b = new B();
        b.get();
    }
}