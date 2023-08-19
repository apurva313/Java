interface A {
    void methodA();
}

interface B {
    void methodB();
}

class ParentClass {
    void parentMethod() {
        System.out.println("Parent method");
    }
}

class ChildClass extends ParentClass implements A, B {
    @Override
    public void methodA() {
        System.out.println("Method A");
    }

    @Override
    public void methodB() {
        System.out.println("Method B");
    }
}

public class hybrid {
    public static void main(String[] args) {
        ChildClass child = new ChildClass();

        child.parentMethod(); // Calling inherited method from ParentClass
        child.methodA();      // Calling method from Interface A
        child.methodB();      // Calling method from Interface B
    }
}
