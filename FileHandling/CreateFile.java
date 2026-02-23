import java.io.*;
public class CreateFile{
    public static void main(String[] args){
        try{
            File obj=new File("file1.txt");
            if(obj.createNewFile()){
                System.out.println("File1 is Created");
            }
            else{
                System.out.println("File Already Exists");
            }
        }
        catch(IOException e){
            System.out.println("File Not Created :"+e.getMessage());
        }
    }
}