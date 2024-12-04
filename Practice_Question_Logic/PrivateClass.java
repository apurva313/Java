package Practice_Question_Logic; 

class Student {  // Default access modifier, i.e., package-private
    private int rollno;
    private String name;
    
    Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }
    
    void display() {
        System.out.println(rollno + " " + name);
    }
}

public class PrivateClass {
    public static void main(String[] args) {
        Student s = new Student(111, "Karan");
        s.display();
    }
}
