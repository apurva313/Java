import java.io.*;

public class ReadFileANDWriteAnotherFile {
    public static void main(String[] args){
        try{
            FileReader fr=new FileReader("files/appu0.txt");
            FileWriter fw=new FileWriter("files/appu0_copy.txt");
            int c;
            while((c=fr.read())!=-1){
                fw.write(c);
            }
            fr.close();
            fw.close();
            System.out.println("File Copied Successfully");
        }catch(Exception e){
            System.out.println("An Error Occured: "+ e);
        }
    }
}
