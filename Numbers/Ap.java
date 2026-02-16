import java.util.Scanner;
class Ap{
    public static int  Nthterm(int a,int d,int n){
        return a+(n-1)*d;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first term : ");
        int a=sc.nextInt();
        System.out.println("enter the difference :");
        int d=sc.nextInt();
        System.out.println("enter the Nth term :");
        int N=sc.nextInt();
        System.out.println(Nthterm(a,d,N));
        }
}