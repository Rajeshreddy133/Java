import java.util.*;
import java.io.*;
public class Nullpointer{
    public static void main(String[] args){
        String s=null;
        try{
            int n=s.length();
        }catch(NullPointerException e){
            System.out.println("Null Pointer Exception :"+e.getMessage());
        }
    }
}