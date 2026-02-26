import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class ReadFile{
    public static void main(String[] args){
        try{
            File obj=new File("file1.txt");
            Scanner sc=new Scanner(obj);
            while(sc.hasNextLine()){
                String data=sc.nextLine();
                System.out.println(data);
            }
            sc.close();
        }
        catch(FileNotFoundException e){
            System.out.println("File not Found : "+e.getMessage());
        }
    }
}