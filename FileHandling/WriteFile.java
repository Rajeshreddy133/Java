import java.io.*;
import java.io.FileWriter;
public class WriteFile{
    public static void main(String[] args){
        try{
            FileWriter writer=new FileWriter("file1.txt",true);
            writer.write("Hello Everyone");
            writer.close();
            System.out.println("Successfully Written to File");
        }
        catch(IOException e){
            System.out.println("Unable to write on File :"+e.getMessage());
        }
    }
}