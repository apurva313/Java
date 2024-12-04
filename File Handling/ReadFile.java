import java.io.File;
import java.util.Scanner;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        File fileObj = new File("abc.txt");
        Scanner reader = new Scanner(fileObj);
        
        while(reader.hasNextLine()){
            String data=reader.nextLine();
            System.out.println(data);
        }
    }
}
