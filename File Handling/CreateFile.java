
//Write a code in java for creating a file 

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        File myFile = new File("textfile.txt");
        if(myFile.createNewFile()){
            System.out.println("File created: " + myFile.getName());
        } else {
            System.out.println("File already exists.");
        }
    }
}