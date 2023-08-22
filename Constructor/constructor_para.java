class constructor_para {
    String message;

    constructor_para(String msg) {
        message = msg;
    }

    void display() {
        System.out.println(message);
    }

    public static void main(String[] args) {
        constructor_para obj1 = new constructor_para("Hello from obj1!");
        constructor_para obj2 = new constructor_para("Bye from obj2!");

        obj1.display();
        obj2.display();
    }
}