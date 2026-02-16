import java.util.Scanner;
public class Arthemetic extends {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("addition:"+(a+b));
        System.out.println("substraction:"+(a-b));
        System.out.println("product:"+(a*b));
        System.out.println("division:"+(a/b));
        System.out.println("modulus:"+(a%b));
        System.out.println("increment:"+(++a));
        System.out.println("decrement:"+(--a)); 
    }
}