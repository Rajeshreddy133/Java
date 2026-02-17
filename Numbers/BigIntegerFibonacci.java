import java.util.Scanner;
import java.math.BigInteger;
class BigIntegerFibonacci{
    static BigInteger fibonacci(int n){
        BigInteger a=BigInteger.valueOf(0);
        BigInteger b=BigInteger.valueOf(1);
        BigInteger c=BigInteger.valueOf(1);
        for(int i=2;i<n;i++){
            c=a.add(b);
            a=b;b=c;
        }
        return b;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fibonacci(n));
    }
}