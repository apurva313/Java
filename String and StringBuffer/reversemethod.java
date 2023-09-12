//reverse() method

public class reversemethod{

	public static void main(String a[]){
	
	StringBuffer str=new StringBuffer("helloworld");

	System.out.println(str.reverse());
	
	str.insert(0,"hi");
	System.out.println(str);
}

}