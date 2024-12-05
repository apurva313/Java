import java.io.*;

public class ReadFileANDWriteAnotherFile2 {
    public static void main(String[] args) {
        try {
            
            FileReader fr1 = new FileReader("files/appu0.txt");
            FileWriter fw = new FileWriter("files/mergedFile.txt");

            int c;
            
            while ((c = fr1.read()) != -1) {
                fw.write(c);
            }
            fr1.close();

      
            FileReader fr2 = new FileReader("files/appu1.txt");

            while ((c = fr2.read()) != -1) {
                fw.write(c);
            }

            fr2.close();
            fw.close();

            System.out.println("Files Merged Successfully");

        } catch (Exception e) {
            System.out.println("An Error Occurred: " + e);
        }
    }
}
