import java.util.*;
class Expression{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        double d=(b*b)-4*a*c;
        double r1=0;
        double r2=0;
        if(d>0){
            r1=-b+(Math.sqrt(d))/(2*a);
            r2=-b-(Math.sqrt(d))/(2*a);
            System.out.println(r1);
            System.out.println(r2);
        }
        else if(d==0){
            r1=-b/(2*a);
            System.out.println(r1);
        }
        else{
            r1=-b/(2*a);
            r2=-b-(Math.sqrt(-d))/(2*a);
            System.out.println(r1);
            System.out.println(r2);
        }
    }
}