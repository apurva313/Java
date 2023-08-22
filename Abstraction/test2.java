// Java problem to implement 0% abstraction


abstract class A{
	void p2(){
	System.out.println("Hello Apurva!");
}
	void m2(){
	System.out.println("I am concrete method!");
}

}
public class test2 extends A{
	void m1(){
	System.out.println("I am implemented!");
}
public static void main(String a[]){
	test2 ob=new test2();
	ob.p2();
	ob.m1();
	ob.m2();

}

}