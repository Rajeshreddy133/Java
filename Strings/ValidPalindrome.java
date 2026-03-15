import java.util.Scanner;
public class ValidPalindrome{
    public static  boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Eneter the String : ");
        String s=sc.nextLine();
        if(isPalindrome(s)){
            System.out.println(s+" is a Palindrome");
        }
        else{
            System.out.println(s+" is not a Palindrome");
        }
    }
}
