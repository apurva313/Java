import java.io.FileWriter;

public class WriteMultipleFile {
    public static void main(String[] args){
        try{
            for(int i=0; i<10; i++){
                String filename="files/appu"+i+".txt";
                FileWriter my=new FileWriter(filename);
                my.write("This is file number "+i);

                my.close();
            }

        }catch(Exception e){
            System.out.println("An Error Occured: "+ e);
        }finally{
            System.out.println("Files created successfully");
        }
    }
}
