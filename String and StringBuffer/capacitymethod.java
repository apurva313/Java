// capacity() Method

public class capacitymethod{
	public static void main(String a[]){

	StringBuffer str=new StringBuffer();

	System.out.println("Initially: "+str.capacity()); //16
	
	str.append("Hello");
	
	System.out.println("less than 16 char: "+str.capacity()); // 16 is printed because "hello" is contain 5 letter
	
	str.append("Hello new sweet world");

	System.out.println("Greater than 16 char: "+str.capacity()); // 34 is printed because above string contain greater than 16 letter (oldcap*2)+2

}


 }