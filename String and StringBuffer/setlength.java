//setLenghth() method

public class setlength{

	public static void main(String a[]){

	StringBuffer buff=new StringBuffer("Tutorials");

	System.out.println(buff);
	System.out.println("Length: "+buff.length());

	buff.setLength(5);
	System.out.println("After Setting length(5): "+ buff);
	System.out.println("Length is that: "+buff.length());
	

	

}

}