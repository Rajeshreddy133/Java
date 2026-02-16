import java.util.*;
class FractionalPartOfNumber{
    static String fractionalPart(String str){
       int  position=str.indexOf('.');
        return str.substring(position+1);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        String str=sc.nextLine();
        System.out.println(fractionalPart(str));
    }
}