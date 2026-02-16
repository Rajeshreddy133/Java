import java.util.Scanner;
public class Reversestring{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char ch;
        String reverse=" ";
        for(int i=0;i<str.length();i++){
            ch=str.charAt(i);
            reverse=ch+reverse;
        }
        System.out.println("reversed String is "+reverse);
    }

}