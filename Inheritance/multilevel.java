class Grandparent {
    void meth1() {
        System.out.println("Method from Grandparent");
    }
}

class Parent extends Grandparent {
    void meth2() {
        System.out.println("Method from Parent");
    }
}

class Child extends Parent {
    void meth3() {
        System.out.println("Method from Child");
    }
}

public class multilevel {
    public static void main(String[] args) {
        Child child = new Child();
        child.meth1();
        child.meth2();
        child.meth3();
    }
}
