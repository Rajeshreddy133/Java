import java.util.Scanner;
public class Leap{
    public static boolean isleap(int num){
        if(num%400==0||num%4==0&&num%100!=0){
            return true;
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number :");
        int num=sc.nextInt();
        if(isleap(num)){
            System.out.println(num+"is a leap year");
        }
        else{
            System.out.println(num+"is not a leap year");
        }
    }
}