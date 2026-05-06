import java.util.*;
class BinaryPalindrome{
    public static boolean isBinaryPalindrome(int n) {
        int rev = 0,temp = n;

        while (temp > 0) {
            rev = (rev << 1) | (temp & 1);
            temp >>= 1; 
        }

        return n == rev;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(isBinaryPalindrome(n));
    }
}