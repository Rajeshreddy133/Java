import java.util.Scanner;

public class ClimbingStairs {
    public static int climbStairs(int n) {
        if(n<=2) return n;
        int a=1;
        int b=2;
        for(int i=3;i<=n;i++){
            int curr=a+b;
            a=b;
            b=curr;
        }
        return b;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of  posts : ");
        int n=sc.nextInt();
        System.out.println(climbStairs(n));
    }
} 

