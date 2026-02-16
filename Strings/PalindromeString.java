import java.util.*;
class PalindromeString{
    public static boolean isPalindrome(String s){
        String rev="";
        char ch;
        for(int i=0;i<s.length();i++){
            ch=s.charAt(i);
            rev=ch+rev;
        }
        return s.equals(rev);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        if(isPalindrome(s)){
            System.out.println(s+" is a palindrome");
        }
        else{
            System.out.println(s+" is not a palindrome");
        }
    }
}