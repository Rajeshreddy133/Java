import java.util.Scanner;
class Demo{
    int a;
    int b;
    int n;
    public Demo(int num){
        this.n=num;
        a=0;
        b=1;
        System.out.println(a+" " +b);
        for(int i=0;i<n;i++){
            int next=a+b;
            a=b;
            b=next;
            System.out.println(next);
        }
    }
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       int num=sc.nextInt();
       Demo d=new Demo(num);
    }
}