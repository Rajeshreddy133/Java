 import java.util.Scanner;
 class Palindrome{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number:");
        int num=scanner.nextInt();
        if(isPalindrome(num)){
            System.out.println("the number is palindrome");
        }
        else{
            System.out.println("the number is not a palindrome");
        }

    }
    public static boolean isPalindrome(int num){
        int temp=num;
        int rev=0;
        while(num>0){
           int digit=num%10;
           rev=rev*10+digit;
           num=num/10;
        }
        return temp==rev;

    }

 }