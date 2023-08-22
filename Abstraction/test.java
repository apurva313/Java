// Java problem to implement 50% abstraction

abstract class A{

	abstract void m1();
	
	void m2(){
	System.out.println("I am concerte method!");
}

}
public class test extends A{
	void m1(){
	System.out.println("I am Implemented!");
}
public static void main(String a[]){
	test ob=new test();
	ob.m1();
	ob.m2();

}
}