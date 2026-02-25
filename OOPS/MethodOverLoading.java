import java.util.*;
class Calc{
    int add(int a,int b){
        return a+b;
    }
    double add(double a,double b){
        return a+b;
    }
    double add(int a,double b){
        return a+b;
    }
    double add(double a,int b){
        return a+b;
    }
}
public class MethodOverLoading{
    public static void main(String[] args){
        int a=34;
        int b=46;
        double c=34.4;
        double d=45.2;
        Calc calc=new Calc();
        System.out.println(calc.add(a,b));
        System.out.println(calc.add(c,d));
        System.out.println(calc.add(b,c));
        System.out.println(calc.add(d,a));
    }
}