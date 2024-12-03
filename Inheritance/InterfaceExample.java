// Example of Interface in Java

interface Animal {
    void eat();
    void sleep();
}
class Dog implements Animal {
    public void eat() {
        System.out.println("Dog is eating.");
    }
    public void sleep() {
        System.out.println("Dog is sleeping.");
    }
    void bark() {
        System.out.println("Dog is barking.");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Dog d= new Dog();
        d.eat();
        d.sleep();
        d.bark();
    }
}

//Output:
//Dog is eating.
//Dog is sleeping.

