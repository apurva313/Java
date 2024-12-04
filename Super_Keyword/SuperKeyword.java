//package Super_Keyword;

class Person{
    Person(){
        System.out.println("Person class constructor");
    }
    int age=5;

    void display(){
        System.out.println("Person class display method");
    }
}

class Student extends Person{
    Student(){
        super();
    }
    void doSomething() {
        super.display();
        System.out.println(super.age);
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.doSomething();
    }
}

// Output:
// Person class constructor
// Person class display method
// 5

