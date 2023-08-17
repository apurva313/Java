class constructor {
    String message;

    constructor() {
        message = "Hello, I am a non-parameterized constructor!";
    }

    void display() {
        System.out.println(message);
    }

    public static void main(String[] args) {
        constructor obj = new constructor();
        obj.display();
    }
}
