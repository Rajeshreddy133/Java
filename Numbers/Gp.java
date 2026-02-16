import java.util.Scanner;
class Gp{
    public static int Nthterm(int a,int d,int n){
        return a*(int)(Math.pow(d,n-1));
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number : ");
        int a=sc.nextInt();
        System.out.println("enter the difference number : ");
        int d=sc.nextInt();
        System.out.println("enter the Nth term : ");
        int N=sc.nextInt();
        System.out.println(Nthterm(a,d,N));
    }
}