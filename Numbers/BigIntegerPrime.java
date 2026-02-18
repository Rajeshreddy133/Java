import java.util.*;
import java.math.*;
class BigIntegerPrime{
    static boolean checkPrime(long n){
        BigInteger b=new BigInteger(String.valueOf(n));
        return b.isProbablePrime(1);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        long n=sc.nextInt();
        System.out.println(checkPrime(n));
    }
}