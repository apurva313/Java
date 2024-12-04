import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        try{
            FileWriter my=new FileWriter("abc.txt");
            my.write("This is a file created using java");
            my.close();
        }catch(Exception e){
            System.out.println("An error occurred.");
        }
    }
}
