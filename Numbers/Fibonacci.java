import java.util.Scanner;
public class Fibonacci{
    public static void main(String args[]){
        int first=0;int second=1;int third=2;int next;
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("Fibonacci series is :");
        for(int i=0;i<+num;i++){
            System.out.println(first+" ");
            next=first+second+third;
            first=second;
            second=third;
            third=next;
        }
    }
}