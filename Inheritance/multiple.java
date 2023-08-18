interface A{
    void meth();
}

interface B{
    void meth();
}

 class C implements A,B{
    public void meth(){
        System.out.println("I am implemented!");
    }
}

public class multiple{
    public static void main(String args[]){
        C obj= new C();
        obj.meth();

        A obj2= new C();
        obj2.meth();
    }
}