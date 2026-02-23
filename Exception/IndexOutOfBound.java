import java.io.*;
public class IndexOutOfBound{
    public static void main(String[] args){
        int a[]={3,4,2,6,};
        try{
            int c=a[8];
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("Array Index Out Of Bounds Exception :"+e.getMessage());
        }
    }
}