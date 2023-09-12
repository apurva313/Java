//replace() method

public class replacemethod{
	public static void main(String a[]){
	
	StringBuffer str= new StringBuffer("Hi IIT College");
	System.out.println("Before Replace: "+str);
	str.replace(3,9,"NIT");
	System.out.println("After Replace: "+ str);
}

}